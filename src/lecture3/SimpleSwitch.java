package lecture3;

public class SimpleSwitch {

    public static void main(String[] args) {

        String drink = "coffeee";
        switch (drink){
            case "milk":
                System.out.println("i will drink Milk");
                break;
            case "tea":
                System.out.println("i will drink tea");
                break;
            case "coffeee":
                System.out.println("i will drink Milk");
                break;
            default:
                System.out.println("Say what???");
        }
    }
}

