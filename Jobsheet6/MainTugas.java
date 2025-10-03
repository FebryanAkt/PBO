public class MainTugas {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(3);

        Dosen d1 = new Dosen("123", "Agus", "Malang");
        d1.setSKS(10);

        Dosen d2 = new Dosen("456", "Hardi", "Malang");
        d2.setSKS(8);

        Dosen d3 = new Dosen("789", "Drajat", "Malang");
        d3.setSKS(12);

        daftar.addPegawai(d1);
        daftar.addPegawai(d2);
        daftar.addPegawai(d3);

        daftar.printSemuaGaji();
    }
}
