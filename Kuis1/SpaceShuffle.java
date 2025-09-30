public class SpaceShuffle {
    private String kode;
    private int berat;
    private Roket RoketUtama;
    private Generator GeneratorUtama;

    public SpaceShuffle(String kd, int brt, Roket rkt, Generator gnt){
        this.kode = kd;
        this.berat = brt;
        this.RoketUtama = rkt;
        this.GeneratorUtama = gnt;
    }
    public String getKode(){
        return kode;
    }
    public int getBerat(){
        return berat;
    }
    public Roket getRoketUtama(){
        return RoketUtama;
    }
    public Generator getGeneratorUtama(){
        return GeneratorUtama;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public void setBerat(int berat){
        this.berat = berat;
    }
    public void setRoketUtama(Roket rkt){
        this.RoketUtama = rkt;
    }
    public void setGeneratorUtama(Generator gnt){
        this.GeneratorUtama = gnt;
    }
}
