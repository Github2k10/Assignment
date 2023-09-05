import java.util.Scanner;

public class Problem1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();

        if(age >= 18) System.out.println("You are an adult.");
        else System.out.println("You are a minor.");
        sc.close();
    }
}
