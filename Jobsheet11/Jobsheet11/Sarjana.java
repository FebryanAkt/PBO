public class Sarjana extends Mahasiswa implements IBerprestasi{
    public Sarjana (String nama){
        super(nama);
    }

    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    @Override
    public void membuatPublikasiIlmiah(){
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
