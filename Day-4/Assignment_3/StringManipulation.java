import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentance: ");
        String para = sc.nextLine().toLowerCase();

        if(para.contains("java")){
            System.out.println("Found 'java' in the sentence.");
        } else {
            System.out.println("The word 'java' is not found in the sentence.");
        }

        sc.close();
    }
}
