package operazioniGeometriche;

import java.util.Scanner;

public class TriangoloRettangoloTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float altezza;
        float base;
        float lato;
        float perimetro;
        float area;
        
        System.out.print("Inserisci l'altezza :  ");
        altezza=in.nextFloat();
        
        System.out.print("Inserisci la base   :  ");
        base=in.nextFloat();
        
        System.out.print("Inserisci il lato   :  ");
        lato=in.nextFloat();
        
        TriangoloRettangolo triangolo = new TriangoloRettangolo (altezza,base,lato);
        
        altezza   =triangolo.altezza;
        base      =triangolo.base;
        lato      =triangolo.lato;
        perimetro =triangolo.calcolaPerimetro();
        area      =triangolo.calcolaArea();
        
        System.out.printf("Lìaltezza è    :  %.2f\n", altezza);
        System.out.printf("La base è      :  %.2f\n", base);
        System.out.printf("Il lato è      :  %.2f\n", lato);
        System.out.printf("L'area è       :  %.2f\n", area);
        System.out.printf("Il perimetro è :  %.2f\n", perimetro);  
    }
}
