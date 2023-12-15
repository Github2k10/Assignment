package Assignment_26;

public class Problem04 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length() - 1;
        while(i >= 0){
            if(s.charAt(i) == ' ') break;
            i--;
        }

        return s.length() - i - 1;
    }
}
