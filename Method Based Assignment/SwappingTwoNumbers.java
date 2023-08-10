import java.util.Scanner;

public class SwappingTwoNumbers{
    static void swapNumbers(int n, int m){
        System.out.println("Numbers before swapping: ");
        System.out.println("a = " + n + ", b = " + m);

        n += m;
        m = n - m;
        n = n - m;

        System.out.println("Numbers after swapping: ");
        System.out.println("a = " + n + ", b = " + m);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        swapNumbers(n, m);

        sc.close();
    }
}