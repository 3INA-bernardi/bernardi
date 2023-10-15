package operazioniGeometriche;

import java.util.Scanner;

public class QuadratoTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float lato1;
        float perimetro;
        float area;
        
        System.out.println("Inserisci il lato:  ");
        lato1=in.nextFloat();
        
        Quadrato quadrato = new Quadrato(lato1);
        
        lato1=quadrato.lato1;
        area=quadrato.calcolaArea();
        perimetro=quadrato.calcolaPerimetro();
        
        System.out.println("Il lato è:        " + lato1);
        System.out.println("L'area è:           " + area);
        System.out.println("la perimetro è: " + perimetro);
    }
    
}
