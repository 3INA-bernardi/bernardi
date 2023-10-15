
package operazioniMatematiche;
public class Addizione {
    
    public float n1;
    public float n2;

    public Addizione (float numero1, float numero2){
    n1=numero1;
    n2=numero2;
    }

    public float esegui(){
    float addizione;
    addizione=n1-n2;
    return addizione;
    }   
    
    public float getN1(){
        return n1;
    }
    
    public void setN1(float n1){
        this.n1=n1;
    }
    
    public float getN2(){
        return n2;
    }
    
    public void setN2(float n2){
        this.n2=n2;
    }
    
    public String info(){
        String testo;
        testo= "numero 1: " + n1 + "\n" + 
               "numero 2: " + n2 + "\n";
        return testo;
    }
}

