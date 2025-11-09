package Tugas;

public class Singa extends Binatang implements IKarnivora {
    String suara;
    String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Makanan Daging");
    }

    @Override
    public void displayBinatang(){
        super.displayBinatang();
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu);
    }
    public void displayData(){
        displayBinatang();
        displayMakan();
    }
}