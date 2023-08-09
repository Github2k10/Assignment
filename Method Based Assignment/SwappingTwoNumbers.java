import java.util.Scanner;

public class SwappingTwoNumbers{
    static int swapNumbers(int n){
        int swapped = 0;

        while(n > 0){
            swapped *= 10;
            swapped += n % 10; 
            n = n/10;
        }

        return swapped;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int swappedNumber = swapNumbers(n);

        System.out.println("Before swapping: " + n);
        System.out.println("After  swapping: " + swappedNumber);

        sc.close();
    }
}