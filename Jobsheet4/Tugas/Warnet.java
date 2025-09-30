package Tugas;

public class Warnet {
    private String nama;
    private Komputer komputer;
    private Pegawai pegawai;
    private Menu menu;

    public Warnet(){

    }
    public Warnet(String nama, Komputer komputer, Pegawai pegawai, Menu menu ){
        this.nama = nama;
        this.komputer = komputer;
        this.pegawai = pegawai;
        this.menu = menu;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKomputer(Komputer komputer){
        this.komputer = komputer;
    }
    public void setPegawai(Pegawai pegawai){
        this.pegawai = pegawai;
    }
    public void setMenu(Menu menu){
        this.menu = menu;
    }
    public String getNama(){
        return nama;
    }
    public Komputer getKomputer(){
        return komputer;
    }
    public Pegawai getPegawai(){
        return pegawai;
    }
    public Menu getMenu(){
        return menu;
    }
    public String info() {
        String info = "";
        info += "\n--- WARNET ---\n";
        info += "Nama Warnet = " + this.nama + "\n\n";
        info += pegawai != null ? pegawai.info() + "\n" : "(Pegawai belum diset)\n\n";
        info += komputer != null ? komputer.info() + "\n" : "(Komputer belum diset)\n\n";
        info += menu != null ? menu.info() : "(Menu belum diset)\n";
        return info;
    }
}
