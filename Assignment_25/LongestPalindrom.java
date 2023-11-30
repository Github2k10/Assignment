package Assignment_25;

public class LongestPalindrom {
    public static String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        int i = 0;
        String str = "";

        while(i < s.length() - 1){
            String s1 = check(s, i, i);
            String s2 = check(s, i, i + 1);

            if(s1.length() > str.length() && s1.length() > s2.length()) str = s1;
            else if(s2.length() > str.length() && s2.length() > s1.length()) str = s2;
            i++;
        }

        return str;
    }

    private static String check(String str, int s, int e){
        while(s >= 0 && e < str.length() && str.charAt(s) == str.charAt(e)){
            s--;
            e++;
        }
        return str.substring(s + 1, e);
    }

    public static void main(String[] args) {
        String s = "babab";
        String st = longestPalindrome(s);
        System.out.println(st);
    }
}
