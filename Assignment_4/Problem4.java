import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = 0;

        System.out.print("Enter numbers to add (or negative number to print addition): ");

        while(true){
            sum += a;
            a = sc.nextInt();

            if(a < 0) break;
        }

        System.out.println("Sum of all the non-negitive numbers: " + sum);

        sc.close();
    }
}
