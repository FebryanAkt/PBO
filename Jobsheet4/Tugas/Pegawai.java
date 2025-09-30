package Tugas;

public class Pegawai {
    private String nama;
    private String devisi;

    public Pegawai(){
        
    }
    public Pegawai(String nama, String devisi){
        this.nama = nama;
        this.devisi = devisi;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setDevisi(String devisi){
        this.devisi = devisi;
    }
    public String getNama(){
        return nama;
    }
    public String getDevisi(){
        return devisi;
    }
    public String info(){
        String info = "";
        info += "--- Pegawai ---\n";
        info += "Nama = " + this.nama + "\n";
        info += "Devisi = " + this.devisi + "\n";
        return info;
    }
}
