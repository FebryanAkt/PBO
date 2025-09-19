public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1,2,3,4", "Spogebob Squarepants");
        Pegawai asisten = new Pegawai("4,5,6,7", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.info());
    }
}
