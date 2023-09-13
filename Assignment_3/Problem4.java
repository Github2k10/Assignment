import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your favorite color: ");
        String color = sc.next();

        if(color.equalsIgnoreCase("blue"))
            System.out.println("Blue is a cool color.");
        else
            System.out.println("Your favorite color is nice too!");
            
        sc.close();
    }
}
