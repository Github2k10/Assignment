import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String str = sc.nextLine();

        System.out.println("Length of the string: " + str.length());
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println(str.contains("Java") ? "Contains 'Java'" : "Does not contains 'Java'");
        sc.close();
    }
}