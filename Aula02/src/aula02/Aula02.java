package aula02;


public class Aula02 {

   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.modelo = "Bic Cristal";
        c1.ponta = 05.f;
        c1.tampada = false;
        c1.carga  = 50;
        c1.status();
        c1.tampar();
        c1.rabiscar();
        
        System.out.println("------------------------------------");
        
        Caneta c2 =  new Caneta();
        c2.cor = "vermelha";
        c2.modelo = "Vitão Pen";
        c2.ponta = 1.f;
        c2.tampada = true;
        c2.carga = 100;
        c2.status();
        c2.rabiscar();
    }
    
}
