
package exercicioaula2;

public class Garrafa {
    String material;
    String cor;
    float armazenamento;
    boolean cheia;
    
    void encher (){
        if(this.cheia == false){
            this.armazenamento = 100;
            this.cheia = true;
            System.out.println("Encheu a garrafa");
        }
        else{
            System.out.println("Garrafa tá cheia já");
        }
    }
    
    void esvaziar(){
        if( this.cheia == true){
            this.armazenamento = 0;
            this.cheia = false;
            System.out.println("Esvaziou a garrafa");
        }
        else{
            System.out.println("Garrfa tá vazia já");
        }
    }
    
    void descrever(){
        System.out.println("Garrafa de "+ this.material);
        System.out.println("Cor : "+ this.cor);
        System.out.println("Com armazenamento "+ this.armazenamento +" ml");
        System.out.println("Está cheia ? "+ this.cheia);
    }
}
