package numeri;
import java.util.Scanner;
public class DiffTraDueNTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double n1;
        double n2;
        
        System.out.print("Inserisci il primo Numero:    ");
        n1=in.nextDouble();
        System.out.print("Inserisci il secondo Numero:  ");
        n2=in.nextDouble();
        
        DiffTraDueN diff= new DiffTraDueN(n1,n2);
        
        System.out.println(diff.info());
        System.out.println("Questa è la differenza tra il numero più grande e il numero più piccolo: " + diff.Differenza());
        
        
    }    
}
