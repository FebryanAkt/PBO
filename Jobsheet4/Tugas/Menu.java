package Tugas;

public class Menu {
    private String makanan;
    private String minuman;

    public Menu(){

    }
    public Menu(String makanan, String minuman){
        this.makanan = makanan;
        this.minuman = minuman;
    }
    public void setMakanan(String makanan){
        this.makanan = makanan;
    }
    public void setMinuman(String minuman){
        this.minuman = minuman;
    }
    public String getMakanan(){
        return makanan;
    }
    public String getMinuman(){
        return minuman;
    }
    public String info(){
        String info = "";
        info += "--- MENU ---\n";
        info += "Makanan = " + this.makanan + "\n";
        info += "Minuman = " + this.minuman + "\n";
        return info;
    }
}
