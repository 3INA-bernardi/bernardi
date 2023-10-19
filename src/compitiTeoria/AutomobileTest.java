package compitiTeoria;

import java.util.Scanner;

public class AutomobileTest {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Scanner in1=new Scanner(System.in);
       
        String targa;
        boolean avviata;
        
        System.out.print("Inserisci la zugutarga della Mercedes : ");
        targa=in.nextLine();
        
        System.out.print("Inserisci se la zugutarga della Mercedes è avviata o no (inserire True o False) : ");
        avviata=in.nextBoolean();
        
        Automobile automobileMercedes= new Automobile (targa);
        
        automobileMercedes.setAvviata(avviata);
       
        Automobile automobileAudi= new Automobile (targa);
        
        System.out.print("\nInserisci la zugutarga dell'Audi : ");
        targa=in1.nextLine();
        
        System.out.print("Inserisci se la zugutarga della'Audi è avviata o no (inserire True o False) : ");
        avviata=in1.nextBoolean();
        
        automobileAudi.setAvviata(avviata);
        
        System.out.print("\nLa zugutarga della Mercedes è questa: " + automobileMercedes.getTarga());
        System.out.println("\nLa zugutarga della Mercedes è avviata?\nSe sì (true) se non è avviata (false) : " + automobileMercedes.getAvviata() );
        System.out.print("\nLa zugutarga dell'Audi è questa: " + automobileAudi.getTarga());
        System.out.println("\nLa zugutarga dell'Audi è avviata?\nSe sì (true) se non è avviata (false) : " + automobileAudi.getAvviata() );
        
    }
    
}
