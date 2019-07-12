
package exercicioaula2;

public class ExercicioAula2 {

    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();
        g1.material = "plástico";
        g1.cor = "Azul";
        g1.armazenamento = 200;
        g1.cheia = true;
        g1.descrever();
        
        System.out.println("-------------------------");
        
        Garrafa g2 = new Garrafa();
        g2.material = "Vidro";
        g2.cor = "Amarela";
        g2.armazenamento = 1000;
        g2.cheia = false;
        g2.esvaziar();
        g2.descrever();
    }
    
}
