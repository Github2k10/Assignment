package Assignment_19;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = gcd(a, b);
        System.out.println("Greatest common divisor: " + k);
    }

    private static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a % b);
    }
}
