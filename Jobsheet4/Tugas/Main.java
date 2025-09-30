package Tugas;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Agus", "OP warnet");
        Komputer komputer = new Komputer(
                "Core i9 / 32GB / GTX 3060",
                "Mechanical",
                "Wireless",
                "144 hz"
        );
        Menu menu = new Menu("Mie Goreng", "Es Teh Manis");

        Warnet warnet = new Warnet("Warnet Febryan", komputer, pegawai, menu);

        System.out.println(warnet.info());
    }
}
