import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed string: " + reverseString(str));

        sc.close();
    }

    public static String reverseString(String str){
        String s = "";

        for(int i = str.length() - 1; i >= 0; i--)
            s += str.charAt(i);

        return s;
    }
}
