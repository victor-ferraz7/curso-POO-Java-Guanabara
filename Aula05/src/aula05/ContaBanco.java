
package aula05;

public class ContaBanco {
    protected String tipo;
    public int numConta;
    private String dono;
    private int saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
        getStatus();
        getSaldo();
    }
 
    public int getSaldo() {
        System.out.println("Saldo da Conta: "+ this.saldo);
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    

    public String getTipo() {     
        System.out.println("Tipo da Conta: "+ this.tipo);
       return tipo;
        
    }

    public void setTipo(String tipo) {
        if(tipo == "cc" || tipo == "cp"){
             this.tipo = tipo;
        }
        else{
            System.out.println("ERROR- Tipo inválido");
        }
    }

    public int getNumConta() {
        System.out.println("Numero da conta: "+ this.numConta);
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        System.out.println("Dono da Conta: "+ this.dono);
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   public boolean getStatus(){
       return status;
   }
    
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        
        if(this.tipo == "cc"){
            setSaldo(50);
        }
        else{
           setSaldo(150);
        }
        System.out.println("Conta Aberta");
        System.out.println(getTipo());
        
        System.out.println(getSaldo());
    }
    
    public void fecharConta(){
        if(this.saldo != 0){
            System.out.println("ERROR- Não pode fechar conta com débitos/saldos pendentes");
        }
        else{
            System.out.println("Conta Fechada");
        }
        this.status = false;
    }
    
    public void depositar(int valor){
        if(status == true){
            setSaldo(valor);
            System.out.println(getSaldo());
        }
        else{
            System.out.println("ERROR- Não é Possível depositar");
        }
    }
   
    public void sacar(int valor){
        if(this.status == true && this.saldo >= valor){
            setSaldo(this.saldo - valor);
            System.out.println(getSaldo());
        }
        else{
            System.out.println("ERROR- Não é possível sacar");
        }
    }
    
    public void pagarMensal(){
        if(this.tipo == "cc"){
            setSaldo(-12) ;
            System.out.println(getSaldo());
        }
        else{
           setSaldo(-20);
            System.out.println(getSaldo());
        }
    }
    
}
