import java.util.Scanner;

public class InputUser {
    public static void print(String s){
        System.out.print(s);
    }

    public static void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print("Enter your name: ");
        String name = sc.nextLine();

        print("Enter you age: ");
        int age = Integer.parseInt(sc.nextLine());

        print("Are you student?: ");
        boolean isStudent = sc.nextBoolean();

        println("\nYour name: " + name);
        println(age > 18 ? "You are an adult." : "You are a minor.");
        println(isStudent ? "You are eligible to be a student." : "You are not eligible to be a student");

        sc.close();
    }
}


//Output:
/*
 * Enter your name: Ankit Kumar
 * Enter you age: 20
 * Are you student?: true
 *
 * Your name: Ankit Kumar
 * You are an adult.
 * You are eligible to be a student
 */