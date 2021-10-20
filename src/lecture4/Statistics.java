package lecture4;

import java.util.Arrays;
import java.util.Random;

public class Statistics {

    int[] array = new int[10];

    public void generateArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println("my array " + Arrays.toString(array));


    }

    public void min() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min number " + min);

    }

    public void max() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max number " + max);
    }

    public void average() {

        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        {
            System.out.println("average num " + sum / array.length);
        }


    }
}