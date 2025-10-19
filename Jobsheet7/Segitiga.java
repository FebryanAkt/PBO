public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    public double keliling(int sisiA, int sisiB) {
        double n = (sisiA * sisiA) + (sisiB * sisiB);
        double x = n;
        for (int i = 0; i < 10; i++) {
            x = 0.5 * (x + (n / x));  
        }
        return x;
    }

}
