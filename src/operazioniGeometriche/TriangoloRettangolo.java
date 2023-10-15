package operazioniGeometriche;

public class TriangoloRettangolo {
    
    public float altezza;
    public float base   ;
    public float lato   ;
    
    public TriangoloRettangolo (float altezza, float base, float lato){
        this.altezza=altezza;
        this.base=base;
        this.lato=lato;
    }
    public float calcolaPerimetro(){
        float perimetro;
        perimetro=(base+altezza+lato);
        return perimetro;
    }
    
    public float calcolaArea(){
        float area;
        area=(base*altezza)/2;
        return area;
    }
    
    public float getAltezza(){
        return altezza;
    }
    
    public void setAltezza(float altezza){
        this.altezza=altezza;
    }
    
    public float getBase(){
        return base;
    }
     
    public void setBase(float base){
        this.base=base;
    }
    
    public float getLato(){
        return lato;
    }
    
    public void setlato(float lato){
        this.lato=lato;
    }
    
    public String info(){
        String testo;
        testo= "altezza è : " + altezza + "\n" + 
               "base è    : " + base    + "\n" +
               "lato è    : " + lato    + "\n" ;
        return testo;
    } 
}
