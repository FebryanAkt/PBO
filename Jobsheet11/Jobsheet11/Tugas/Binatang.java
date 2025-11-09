package Tugas;

public abstract class Binatang {
    String nama;
    int jmlKaki;

    public Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }
    public int getKaki(){
        return jmlKaki;
    }
    public void displayBinatang(){
        System.out.println("Nama Binatang: " + nama);
        System.out.println("Jumlah Kaki: " + jmlKaki);
    }
}