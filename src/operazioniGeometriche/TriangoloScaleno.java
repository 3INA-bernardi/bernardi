package operazioniGeometriche;

public class TriangoloScaleno {
    
    public float lato1;
    public float lato2;
    public float lato3;
    
    public TriangoloScaleno (float lato1, float lato2, float lato3){
        this.lato1=lato1;
        this.lato2=lato2;
        this.lato3=lato3;
    }
    public float calcolaPerimetro(){
        float perimetro;
        perimetro=(lato1+lato2+lato3);
        return perimetro;
    }
    
    public float calcolaArea(){
        float area;
        float perimetro;
        perimetro=(lato1+lato2+lato3);
        area=(float)(Math.sqrt(perimetro*(perimetro-lato1)*(perimetro-lato2)*(perimetro-lato3)));
        return area;
    }
    
    public float getLato1(){
        return lato1;
    }
    
    public void setLato1(float lato1){
        this.lato1=lato1;
    }
    
    public float getLato3(){
        return lato3;
    }
     
    public void setLato3(float lato3){
        this.lato3=lato3;
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
               "lato 2: " + lato2 + "\n" +
               "lato 3: " + lato3 + "\n";
        return testo;
    } 
}