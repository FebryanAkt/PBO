package Jobsheet3;

public class Koperasi {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    public int pinjam;
    public int angsur;

    Koperasi(String noKTP, String nama, int limitPinjaman, int jumlahPinjaman, int pinjam, int angsur){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = jumlahPinjaman;
        this.pinjam = pinjam;
        this.angsur = angsur;
    }
    public String getNoKTP(){
        return noKTP;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }    
    public void pinjam(int uang){
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman += uang;
        }
    }
    public void angsur(int uang){
        if (uang * 10 < jumlahPinjaman) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah peminjaman");
        } else {
            jumlahPinjaman -= uang;            
        }
    }
}