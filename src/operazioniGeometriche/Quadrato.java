
package operazioniGeometriche;
public class Quadrato {
    
    public float lato1;
    
    public Quadrato (float lato1){
        this.lato1=lato1;           
    }
    
    public float calcolaArea(){
        float area;
        area=(lato1*lato1);
        return area;
    }
    
    public float calcolaPerimetro(){
        float perimetro;
        perimetro=lato1*4;
        return perimetro;
    }
    
    public float getLato1(){
        return lato1;
    }
    
    public void setLato1(float lato1){
        this.lato1=lato1;
    }
    
    public String info(){
        String testo;
        testo= "Il lato è: " + lato1;
        return testo;   
    } 
}