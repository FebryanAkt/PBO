public class CaptainIndonesia extends Hero{
    public int level;

    public CaptainIndonesia(String nama, int level){
        super(nama);
        this.level = level;
    }
    public void serang(KillAble ka){
        ka.dead();
        System.out.println(" oleh " + nama);
    }
    
}
