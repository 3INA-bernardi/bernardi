package operazioniGeometriche;

public class Rombo {
    
    public float lato;
    public float diagonale1;
    public float diagonale2;
    
    public Rombo (float lato, float diagonale1, float diagonale2){
        this.lato=lato;
        this.diagonale1=diagonale1;
        this.diagonale2=diagonale2;
    }
    public float calcolaPerimetro(){
        float perimetro;
        perimetro=(lato*4);
        return perimetro;
    }
    
    public float calcolaArea(){
        float area;
        area=(diagonale1*diagonale2)/2;
        return area;
    }
    
    public float getLato(){
        return lato;
    }
    
    public void setLato(float lato){
        this.lato=lato;
    }
    
    public float getDiagonale1(){
        return diagonale1;
    }
     
    public void setDiagonale1(float diagonale1){
        this.diagonale1=diagonale1;
    }
    
    public float getDiagonale2(){
        return diagonale2;
    }
    
    public void setDiagonale2(float diagonale2){
        this.diagonale2=diagonale2;
    }
    
    public String info(){
        String testo;
        testo= "lato        : " + lato       + "\n" + 
               "diagonale 1 : " + diagonale1 + "\n" +
               "diagonale 2 : " + diagonale2 + "\n" ;
        return testo;
    } 
}