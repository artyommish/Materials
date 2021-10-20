package lecture3;

public class SampleForFun {

    public static void main(String[] args) {
        int minNumber = 15;
        int maxNumber = 100;

        if ((minNumber <= 1000) && ( maxNumber >=1000000)){
            System.out.println("Some number is 1");
        } else if ((minNumber <= 0) || ( maxNumber >=10)){
            System.out.println("Some number is 5");
        } else {
            System.out.println("Some number is 111111");
        }
    }
}
