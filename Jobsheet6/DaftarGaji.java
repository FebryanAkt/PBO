public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count = 0;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai p) {
        if (count < listPegawai.length) {
            listPegawai[count] = p;
            count++;
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < count; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() + ", Gaji: " + listPegawai[i].getGaji());
        }
    }
}