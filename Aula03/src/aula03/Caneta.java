
package aula03;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void escrever(){
          if(this.tampada == true){
              System.out.println("ERRO - Não posso escrever com a caneta tampada");
          }
          else{
              System.out.println("Escrevendo...");
          }
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO - Não posso rabiscar com a caneta tampada");
        }
        else{
            System.out.println("Rabiscando ...");
        }
    }
    
    public void pintar(){
        if(this.tampada = true){
            System.out.println("ERRO - Não posso pintar com a caneta tampada");
        }
        else{
            System.out.println("Pintando ...");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    private void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Modelo "+this.modelo);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga "+this.carga+"%");
        System.out.println("Está tampada? "+this.tampada);
    }
}
