package Assignment_19;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String binary = decToBin(n);
        System.out.println("Binary number: " + binary);
    }

    private static String decToBin(int n){
        if(n < 2) return n + "";
        int q = n % 2;
        return decToBin(n/2) + q;
    }
}
