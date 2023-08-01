import java.util.Scanner;

public class Assignment2 {
    static void print(String str){
        System.out.print(str);
    }

    static void println(String str){
        System.out.println(str);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       println("Enter the following details");
       print("Name: ");
        String name = sc.next();

       print("Age: ");
        int age = Integer.parseInt(sc.next());

       print("Student(true/false): ");
        boolean isStudent = sc.nextBoolean();

       println("\nHi, " + name);

        if(age > 18)
           println("You are an adult.");
        else
           println("You are a minor.");

        if(isStudent)
           println("You are eligible to be a student.");
        else
           println("You are not eligible to be a student.");

        sc.close();
    }
}



// Output:
// 
// Enter the following details
// Name: Ankit
// Age: 20
// Student(true/false): true
// 
// Hi, Ankit
// You are an adult.
// You are eligible to be a student.