package figureGeometriche;

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
}