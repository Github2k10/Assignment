import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100){
            System.out.println("Marks should be between 0 to 100");
            System.exit(0);
        }

        if(marks >= 90){
            System.out.println("Grade A");
        } else if(marks >= 80){
            System.out.println("Grade B");
        } else if(marks >= 70){
            System.out.println("Grade C");
        } else if(marks >= 60){
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}