package Assignment_25;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        boolean[] chars = new boolean[128];
        int i = 0, j = 0, count = 0;

        while(i < s.length() && j < s.length()){
            char c = s.charAt(i);
            if(chars[c]){
                char t = s.charAt(j);
                chars[t] = false;
                j++;
            } else {
                chars[c] = true;
                i++;
            }
            count = Math.max(count, i - j);
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int k = lengthOfLongestSubstring(str);
        System.out.println(k);
    }
}
