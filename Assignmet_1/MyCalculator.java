import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-=-=-=-=-=--=-=-= Welcome to the My Calculator App =-=-=-=-=--=-=-=-\n");

        System.out.println("Select your choice...");
        System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication");
        System.out.print("Enter selection: ");
        int choice = sc.nextInt();

        System.out.print("\nEnter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1 -> {
                System.out.println("Addition of given two numbers is " + (a + b));
            }
            case 2 -> {
                System.out.println("Subtraction of given two numbers is " + (a - b));
            }
            case 3 -> {
                System.out.println("Division of given two numbers is " + (a / b));
            }
            case 4 -> {
                System.out.println("Multiplication of given two numbers is " + (a * b));
            }
            default -> System.out.println("Oops! something went wrong. Please select valid option");
        }

        System.out.println("\nThank you for visiting...");
        sc.close();
    }
}

// Output 1:
/*
 * -=-=-=-=-=--=-=-= Welcome to the My Calculator App =-=-=-=-=--=-=-=-
 *
 * Select your choice...
 * 1. Addition
 * 2. Subtraction
 * 3. Division
 * 4. Multiplication
 * Enter selection: 1
 *
 * Enter first number: 584
 * Enter second number: 575
 * Addition of given two numbers is 1159
 *
 * Thank you for visiting...
 */


//Output 2:
/*
* -=-=-=-=-=--=-=-= Welcome to the My Calculator App =-=-=-=-=--=-=-=-
*
* Select your choice...
* 1. Addition
* 2. Subtraction
* 3. Division
* 4. Multiplication
* Enter selection: 2
*
* Enter first number: 852
* Enter second number: 456
* Subtraction of given two numbers is 396
*
* Thank you for visiting...
*/


//Output 3:
/*
 *-=-=-=-=-=--=-=-= Welcome to the My Calculator App =-=-=-=-=--=-=-=-
 *
 * Select your choice...
 * 1. Addition
 * 2. Subtraction
 * 3. Division
 * 4. Multiplication
 * Enter selection: 3
 *
 * Enter first number: 2555
 * Enter second number: 15
 * Division of given two numbers is 170.33333333333334
 *
 * Thank you for visiting...
 */


//Output 4:
/*
 *-=-=-=-=-=--=-=-= Welcome to the My Calculator App =-=-=-=-=--=-=-=-
 * 
 * Select your choice...
 * 1. Addition
 * 2. Subtraction
 * 3. Division
 * 4. Multiplication
 * Enter selection: 4
 *
 * Enter first number: 214
 * Enter second number: 412
 * Multiplication of given two numbers is 88168.0
 *
 * Thank you for visiting...
 */