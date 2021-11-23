package primitives;

public class CompoundAssigments {

    public static void main(String[] args) {


        // +=   -=    *=    /=   %=


        int num1=7;
        int num2=num1 + 7; // 7+7= 14
        num1 += num2;

        System.out.println(num1); //21,  14, 15,


        num2 -= 8; // num2 = num2 -8;

        System.out.println(num2); //6  , -1

        int num3 = num1  + num2;
        num1 += num3;

        System.out.println(num3);

        System.out.println(num1);

        System.out.println(num2);





    }
}
