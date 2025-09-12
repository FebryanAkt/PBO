package Jobsheet3;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Koperasi donny = new Koperasi("111333444", "Donny", 5000000,0,0,0);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        // --- INI KODE SEBELUMNYA --- 

        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                
        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 1.000.000");
        // donny.angsur(1000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    
        // --- INI MODIFIKASI NO 6 ---
        System.out.print("\nMasukkan jumlah pinjaman: ");
        int pinjamUang = sc.nextInt();
        donny.pinjam(pinjamUang);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int angsurUang = sc.nextInt();
        donny.angsur(angsurUang);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        sc.close();
    }
}
