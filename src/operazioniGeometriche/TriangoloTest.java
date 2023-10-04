package operazioniGeometriche;

import java.util.Scanner;

public class TriangoloTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float lato1;
        float lato2;
        float lato3;
        float perimetro;
        float area;
        
        System.out.println("Inserisci il lato uno:  ");
        lato1=in.nextFloat();
        System.out.println("Inserisci il lato due:  ");
        lato2=in.nextFloat();
        System.out.println("Inserisci il lato tre:  ");
        lato3=in.nextFloat();
        
        TriangoloScaleno triangolo = new TriangoloScaleno (lato1,lato2,lato3);
        
        lato1=triangolo.lato1;
        lato2=triangolo.lato2;
        lato3=triangolo.lato3;
        perimetro=triangolo.calcolaPerimetro();
        area=triangolo.calcolaArea();
        
        System.out.println("Il lato uno è:  " + lato1);
        System.out.println("Il lato due è:  " + lato2);
        System.out.println("Il lato tre è:  " + lato3);
        System.out.println("L'area è:       " + area);
        System.out.println("Il perimetro è: " + perimetro);
     
        
    }
    
}