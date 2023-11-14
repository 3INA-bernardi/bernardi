package numeri;

public class DiffTraDueN {
    
    private double n1;
    private double n2;
    
    public DiffTraDueN(){
        
    }
    
    public DiffTraDueN(double n1, double n2){
        this.n1=n1;
        this.n2=n2;
    }
    
    public double getN1(){
        return n1;
    }
    
    public void setN1(double n1){
        this.n1=n1;
    }
    
    public double getN2(){
        return n2;
    }
        
    public void setN2(double n2){
        this.n2=n2;
    }
    
    public double Differenza(){
        double differenza;
        if (n1>n2){
            differenza=n1-n2;
        } else{
            differenza=n2-n1;
        }
        return differenza;
    }
    
    public String info(){
        String testo;
        testo= "il Numero uno è: " + n1 + "\n" +
               "Il Numero due è: " + n2 ;
        return testo;     
    }
}
