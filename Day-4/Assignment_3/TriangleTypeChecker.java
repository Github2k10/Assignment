import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter all the three sides of triangle: ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if(one == two && two == three){
            System.out.println("It's is an Equilateral triangle.");
        } else if((one == two) || (two == three) || (three == one)){    
            System.out.println("It's is an Isosceles triangle.");
        } else {
            System.out.println("It's is a Scalene triangle.");
        }

        sc.close();
    }
}
