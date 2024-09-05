import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a dollar amount: ");
        double amt = sc.nextDouble();
        makeChange(amt);
    }

    public static void makeChange (double amt){
        //Convert dollar amount to change
        int change = (int) Math.round(amt * 100);

        //Use modulus to take away the quarters, dimes, and nickles with the pennies being the remainder
        int hundreds = change/10000;
        change %= 10000;
        int fifties = change/5000;
        change %= 5000;
        int twenties = change/2000;
        change %= 2000;
        int tens = change/1000;
        change %= 1000;
        int fives = change/500;
        change %= 500;
        int dollars = change/100;
        change %= 100;
        int quarters = change/25;
        change %= 25;
        int dimes = change/10;
        change %= 10;
        int nickels = change/5;
        change %= 5;
        int pennies = change;

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Fifties: " + fifties);
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }

}
