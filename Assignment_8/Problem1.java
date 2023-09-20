import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sum(a, b);
        System.out.println("Sum of given two numbers is : " + c);

        sc.close();
    }

    public static int sum(int a, int b){
        return a + b;
    }
}