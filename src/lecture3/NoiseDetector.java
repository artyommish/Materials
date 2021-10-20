package lecture3;

public class NoiseDetector {

    public void check(int noiseDB) {

        if (noiseDB <= 39)
            System.out.println("Faint");
        else if ((noiseDB >= 40) && (noiseDB <= 69))
            System.out.println("Moderate");
        else if ((noiseDB >= 70) && (noiseDB <= 99))
            System.out.println("Very Loud");
    }
}
