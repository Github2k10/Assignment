package Assignment_19;

import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element: ");
        String str = sc.next();

        boolean isPalindrom = palindromCheck(str, 0, str.length() - 1);
        System.out.println(isPalindrom);
    }

    private static boolean palindromCheck(String str, int i, int j){
        if(i > j) return true;
        if(str.charAt(i) != str.charAt(j)) return false;
        return palindromCheck(str, i + 1, j - 1);
    }
}
