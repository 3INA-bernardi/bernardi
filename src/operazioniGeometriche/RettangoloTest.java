package operazioniGeometriche;

import java.util.Scanner;

public class RettangoloTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float lato1;
        float lato2;
        float perimetro;
        float area;
        
        System.out.print("Inserisci il lato uno:  ");
        lato1=in.nextFloat();
        
        System.out.print("Inserisci il lato due:  ");
        lato2=in.nextFloat();
                
        Rettangolo rettangolo = new Rettangolo(lato1,lato2);
        
        lato1    =rettangolo.lato1;
        lato2    =rettangolo.lato2;
        area     =rettangolo.calcolaArea();
        perimetro=rettangolo.calcolaPerimetro();
        
        System.out.printf("Il lato uno è : %.2f\n", lato1);
        System.out.printf("Il lato due è : %.2f\n", lato2);
        System.out.printf("L'area è      : %.2f\n", area);
        System.out.printf("Il perimetro è: %.2f\n", perimetro);  
    }
    
}