package operazioniGeometriche;

public class Cerchio {
    
    public float raggio;
    
    public Cerchio (float r){
        raggio=r; 
    }
    
    public float calcolaArea(){
        float area;
        area=(3.14f*raggio*raggio);
        return area;
    }
    
    public float calcolaCirconferenza(){//circonferenza
        float circonferenza;
        circonferenza=(3.14f*2*raggio);
        return circonferenza;
    }
    
    public float getRaggio(){
        return raggio;
    }
    
    public void setRaggio(float raggio){
        this.raggio=raggio;
    }
    
    public String info(){
        String testo;
        testo= "Il raggio è: " + raggio;
        return testo;   
    }    
}
