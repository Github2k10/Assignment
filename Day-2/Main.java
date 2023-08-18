import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a character: ");
//        char ch = s;
//
//        if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
//            System.out.println("Vowel");
//        } else {
//            System.out.println("Continent");
//        }

        int num = 0;
        String str = "10101";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '1'){
                num += Math.pow(2, i);
            }
        }

        System.out.println(num);
    }
}
// 0 1 2 3 4 5
// 1 2 4 8 16 32
// 1 0 1 0 1
// 1 + 4 + 16 = 21