import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers to add (or 0 to end print sum of all numbers): ");
        int sum = 0;
        int a = 0;
        do{
            sum += a;
            a = sc.nextInt();

            if(a == 0) break;
        }while(true);

        System.out.println("Sum of all numbers: " + sum);
        
        sc.close();
    }
}
