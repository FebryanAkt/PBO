public class Roket {
    private String tipe;
    private int power;

    public Roket(String tipe, int pwr){
        this.tipe = tipe;
        this.power = pwr;
    }
    public String getTipe(){
        return tipe;
    }
    public int getPwr(){
        return power;
    }
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    public void setPwr(int pwr){
        this.power = pwr;
    }
}
