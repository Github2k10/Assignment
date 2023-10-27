package Assignment_19;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int out = count(str, 0);
        System.out.println("Vowels count: " + out);
    }

    private static int count(String str, int i){
        if(i >= str.length()) return 0;
        char c = str.charAt(i);
        return count(str, i + 1) + (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ? 1 : 0);
    }
}
