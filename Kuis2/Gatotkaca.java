public class Gatotkaca extends Hero{
    public int speed;

    public Gatotkaca(String nama, int speed){
        super(nama);
        this.speed = speed;
    }
    public void serang(KillAble ka){
        ka.dead();
        System.out.println(" oleh " + nama);
    }
}
