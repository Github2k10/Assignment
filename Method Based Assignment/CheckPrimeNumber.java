import java.util.Scanner;

public class CheckPrimeNumber {
    static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;

        for(int i = 2; i < n/2; i++){
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Given number " + n + (isPrime(n) ? " is a" : " is not a") + " Prime number.");

        sc.close();
    }
}
