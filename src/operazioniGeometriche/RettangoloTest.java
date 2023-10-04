package operazioniGeometriche;

import java.util.Scanner;

public class RettangoloTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float lato1;
        float lato2;
        float perimetro;
        float area;
        
        System.out.println("Inserisci il lato uno:  ");
        lato1=in.nextFloat();
        System.out.println("Inserisci il lato due:  ");
        lato2=in.nextFloat();
        
        Rettangolo rettangolo = new Rettangolo(lato1,lato2);
        
        lato1=rettangolo.lato1;
        lato2=rettangolo.lato2;
        area=rettangolo.calcolaArea();
        perimetro=rettangolo.calcolaPerimetro();
        
        System.out.println("Il lato uno è:  " + lato1);
        System.out.println("Il lato due è:  " + lato2);
        System.out.println("L'area è:       " + area);
        System.out.println("Il perimetro è: " + perimetro);
     
        
    }
    
}