
    public class interfacemain{
        public static void main(String[] args) {
            Rektor pakrektor = new Rektor();

            Sarjana sarjanaCumlaude = new Sarjana("Dini");
            PascaSarjana masterCumlaude = new PascaSarjana("Elok");

            pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
            pakrektor.beriSertifikatCumlaude(masterCumlaude);

        }
    }