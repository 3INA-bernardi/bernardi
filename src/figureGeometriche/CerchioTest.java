package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float raggio;
        float circonferenza;
        float area;
        
        System.out.println("Inserisci il raggio:  ");
        raggio=in.nextFloat();
        
        Cerchio cerchio = new Cerchio(raggio);
        
        raggio=cerchio.raggio;
        area=cerchio.calcolaArea();
        circonferenza=cerchio.calcolaCirconferenza();
        
        System.out.println("Il raggio è:        " + raggio);
        System.out.println("L'area è:           " + area);
        System.out.println("la circonferenza è: " + circonferenza);
     
        
    }
    
}
