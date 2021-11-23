package primitives;

public class Farm {

    public static void main(String[] args) {


        /*
        in a farm.there are 12 cows and 23 chickens
        1 - find the total legs of the animals in the farm and print out
        2- if each cow coast $ 2345 and each chicken coast 23.99
           find the total worth of these animals and print out

         */

        int chicken = 23;
        int cow =12;
        int totalleg =(chicken * 2)+(cow*4); //chckenlegs * 2 + cowlegs * 4 =94
        System.out.println("total number of the legs in the farm is " + totalleg);

        double cow$ = 2345;
        double chicken$ = 23.99f;
        double total$ = cow * cow$ + chicken * chicken$;

        System.out.println("The total worth of the animals is = " + total$);



    }
}
