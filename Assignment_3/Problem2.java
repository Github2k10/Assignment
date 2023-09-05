import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num == 0)
            System.out.println("You have entered zero.");
        else if(num > 0)
            System.out.println("You have entered a positive number.");
        else
            System.out.println("You have entered a negative number");
            
        sc.close();
    }
}
