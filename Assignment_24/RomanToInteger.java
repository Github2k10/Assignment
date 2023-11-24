package Assignment_24;

public class RomanToInteger {
    public int romanToInt(String s) {
        int n = 0;
        int t = 0;

        for(int i = 0; i < s.length() - 1; i++){
            int a = helper(s.charAt(i + 1));
            int b = helper(s.charAt(i));

            if(a > b){
                t += b;
            } else {
                n += b - t;
                t = 0;
            }
        }

        n += helper(s.charAt(s.length() - 1)) - t;
        return n;
    }

    private int helper(char c){
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return -1;
    }
}
