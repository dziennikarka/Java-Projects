
public class Kirja {
    private String nimi; 
    private int sivuMaara;
    private int vuosi;
    
    public Kirja(String nimi, int sivuMaara, int kirjoitusVuosi){
        this.nimi = nimi;
        this.sivuMaara = sivuMaara;
        this.vuosi = kirjoitusVuosi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getSivuMaara(){
        return this.sivuMaara;
    }
    
    public int getVuosi(){
        return this.vuosi;
    }
    
    @Override
    public String toString(){
        return this.nimi + ", " + this.sivuMaara + " sivua, " + this.vuosi;
    }
    
}
