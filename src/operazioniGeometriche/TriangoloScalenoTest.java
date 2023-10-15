package operazioniGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float lato1;
        float lato2;
        float lato3;
        float perimetro;
        float area;
        
        System.out.print("Inserisci il lato uno:  ");
        lato1=in.nextFloat();
        
        System.out.print("Inserisci il lato due:  ");
        lato2=in.nextFloat();
        
        System.out.print("Inserisci il lato tre:  ");
        lato3=in.nextFloat();
        
        TriangoloScaleno triangolo = new TriangoloScaleno (lato1,lato2,lato3);
        
        lato1    =triangolo.lato1;
        lato2    =triangolo.lato2;
        lato3    =triangolo.lato3;
        perimetro=triangolo.calcolaPerimetro();
        area     =triangolo.calcolaArea();
        
        System.out.printf("Il lato uno è :  %.2f\n", lato1);
        System.out.printf("Il lato due è :  %.2f\n", lato2);
        System.out.printf("Il lato tre è :  %.2f\n", lato3);
        System.out.printf("L'area è      :  %.2f\n", area);
        System.out.printf("Il perimetro è:  %.2f\n", perimetro);  
    }
}