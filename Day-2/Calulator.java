import java.util.Scanner;

public class Calulator{
    public double sum(double a, double b){
        return a + b;
    }

    public double sub(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        return a / b;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calulator cal = new Calulator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nSelect your choice:\n1. Sum\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter: ");
        int c = sc.nextInt();

        switch(c){
            case 1:{
                System.out.println("Sum of given number is: " + cal.sum(a, b));
            }
            break;

            case 2:{
                System.out.println("Subtraction of given number is: " + cal.sub(a, b));
            }
            break;

            case 3:{
                System.out.println("Multiplication of given number is: " + cal.multiply(a, b));
            }
            break;

            case 4:{
                System.out.println("Division of given number is: " + cal.divide(a, b));
            }
            break;

            default:{
                System.out.println("Invalid selection!!!");
            }
        }
        sc.close();
    }
}