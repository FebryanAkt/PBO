package Tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jenis: Herbivora");

        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        keledai.displayMakan();
        keledai.displayBinatang();
        
        System.out.println(); 

        System.out.println("Jenis: Karnivora + Herbivora");

        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        gorilla.displayMakan();
        gorilla.displayBinatang();

        System.out.println(); 

        System.out.println("Jenis: Karnivora");

        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        singa.displayMakan();
        singa.displayBinatang();
    }
}