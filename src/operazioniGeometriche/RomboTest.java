package operazioniGeometriche;

import java.util.Scanner;

public class RomboTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
           
        float lato;
        float diagonale1;
        float diagonale2;
        float perimetro;
        float area;
        
        System.out.print("Inserisci il lato        :  ");
        lato=in.nextFloat();
        
        System.out.print("Inserisci la diagonale 1 :  ");
        diagonale1=in.nextFloat();
        
        System.out.print("Inserisci la diagonale 2 :  ");
        diagonale2=in.nextFloat();
        
        Rombo rombo = new Rombo (lato,diagonale1,diagonale2);
        
        lato       =rombo.lato;
        diagonale1 =rombo.diagonale1;
        diagonale2 =rombo.diagonale2;
        perimetro  =rombo.calcolaPerimetro();
        area       =rombo.calcolaArea();
        
        System.out.printf("Il lato  è       :  %.2f\n", lato);
        System.out.printf("la diagonale 1 è :  %.2f\n", diagonale1);
        System.out.printf("la diagonale 2 è :  %.2f\n", diagonale2);
        System.out.printf("L'area è         :  %.2f\n", area);
        System.out.printf("Il perimetro è   :  %.2f\n", perimetro);  
    }
}