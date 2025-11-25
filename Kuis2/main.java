public class main {
    public static void main(String[] args) {
        Gatotkaca g = new Gatotkaca("Gatots", 99);
        CaptainIndonesia ci = new CaptainIndonesia("Caps", 77);

        g.serang(new Evil());
        ci.serang(new Evil());
        ci.serang(new Villain());
    }
}
