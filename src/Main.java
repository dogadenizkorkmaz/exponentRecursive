import java.util.Scanner;
public class Main {

    static int exp(int base, int expo) { //define method here

        if (expo == 0) {   //the zeroth power equals one
            return 1;
        } else {
            return base * exp(base, expo - 1);   // recursive portal starts here
        }
    }
    public static void main(String[] args) {
        Scanner doa = new Scanner(System.in);// define scanner

        System.out.print("Enter The Base : ");// get base value from user
        int base = doa.nextInt();

        System.out.print("Enter The Exponent : ");// get exponent value from user
        int expo = doa.nextInt();

        System.out.println("Result: " + exp(base, expo)); //call method
    }
}