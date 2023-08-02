import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 2; i < n/2; i++){
            if(n % i == 0){
                System.out.println(n + " is not a Prime number.");
                System.exit(0);
            }
        }

        System.out.println(n + " is a Prime number.");
        sc.close();
    }    
}
