
package compitiTeoria;

public class Automobile {
    
    private String targa;
    private boolean avviata;
   
    public Automobile(String targa){
        this.targa=targa;
    }
    
    public String getTarga(){
        return targa;
    }
    
    public void setTarga(String targa){
        this.targa=targa;
    }
    
    public boolean getAvviata(){
        return avviata;
    }
    
    public void setAvviata(boolean avviata){
        this.avviata=avviata;
    }
    
}
