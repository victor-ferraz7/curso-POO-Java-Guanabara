
package aula04;

public class Aula04 {

    
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Bic","Preta", 0.4f);     
        caneta1.status();
        
        System.out.println("------------------");
        
        Caneta caneta2 = new Caneta("Caneta da Fisk","Azul", 1.3f);
        caneta2.status();
    }
    
}
