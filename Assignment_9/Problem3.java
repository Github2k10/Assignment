import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if(num >= 10){
            System.out.println((int)num);
        } else {
            System.out.println(Math.round(num));
        }
        sc.close();
    }
}
