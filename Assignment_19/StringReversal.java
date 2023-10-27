package Assignment_19;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String out = reverse(str, 0);
        System.out.println("Reversed string: " + out);
    }

    private static String reverse(String str, int i){
        if(i >= str.length()) return "";
        return reverse(str, i + 1) + str.charAt(i);
    }
}
