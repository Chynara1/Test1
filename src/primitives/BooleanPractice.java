package primitives;

public class BooleanPractice {

    public static void main(String[] args) {

        int number =11;
        System.out.println(number);

        boolean isHungry = true;
        System.out.println(isHungry);

        boolean isLightOn = false;
        System.out.println(isLightOn);

        System.out.println(true);

        System.out.println(isHungry == isLightOn);

        isLightOn = isHungry;
        isLightOn = false;

        System.out.println("Last version for" +isHungry); //true
        System.out.println("last for is Light>> "+isLightOn); // false




    }

    }


