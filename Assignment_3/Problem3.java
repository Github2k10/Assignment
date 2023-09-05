import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0 && num > 10)
            System.out.println("The number is even and greater than 10.");
        else 
            System.out.println("The number is neither even nor greater than 10.");

        sc.close();
    }
}
