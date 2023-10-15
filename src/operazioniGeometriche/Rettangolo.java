package operazioniGeometriche;

public class Rettangolo {
    
    public float lato1;
    public float lato2;
    
    public Rettangolo (float lato1, float lato2){
        this.lato1=lato1;
        this.lato2=lato2;            
    }
    
    public float calcolaArea(){
        float area;
        area=(lato1*lato2);
        return area;
    }
    
    public float calcolaPerimetro(){
        float perimetro;
        perimetro=(lato1+lato2)*2;
        return perimetro;
    }
    
    public float getLato1(){
        return lato1;
    }
    
    public void setLato1(float lato1){
        this.lato1=lato1;
    }
    
    public float getLato2(){
        return lato2;
    }
    
    public void setlato2(float lato2){
        this.lato2=lato2;
    }
    
    public String info(){
        String testo;
        testo= "lato 1: " + lato1 + "\n" + 
               "lato 2: " + lato2 + "\n";
        return testo;
    }
}