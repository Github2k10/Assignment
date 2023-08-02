import java.util.Scanner;

public class StringReversalWithPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        System.out.print("Reverse order of string: " + rev);

        if(str.contentEquals(rev)){
            System.out.println("\nGiven string is a palindrome.");
        } else {
            System.out.println("\nGiven string is not a palindrome.");
        }

        sc.close();
    }
}
