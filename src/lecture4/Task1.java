package lecture4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(100);
        int dice2 = random.nextInt(100);
        int dice3 = random.nextInt(100);

        System.out.println("Dice 1 " + dice1);
        System.out.println("Dice 2 " + dice2);
        System.out.println("Dice 3 " + dice3);

        int sum = dice1 + dice2 + dice3;
        System.out.println("Sum " + sum);

    }
}
