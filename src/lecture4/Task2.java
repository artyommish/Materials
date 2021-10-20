package lecture4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int dice3;
        Random randomGenerator = new Random();


        do{

            dice1 = (int) (Math.random() *6) +1;
            dice2 = (int) (Math.random() *6) +1;
            dice3 = (int) (Math.random() *6) +1;
            System.out.println("dice1 = " +dice1 + " dice2 = " +dice2 + " dice3 = " +dice3);
        }
        while
        ((dice1!=dice2) || (dice1 != dice3));

    }
}
