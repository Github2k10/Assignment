package Assignment_25;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0, i = 0, j = 0;

        while(i < s.length() && j < s.length()){
            // System.out.println(j + " : " + i + " : " + count + " : " + map);
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int k = map.get(c);

                if(k + 1 > 1){
                    char t = s.charAt(j);
                    map.put(t, map.get(t) - 1);
                    j++;
                } else {
                    map.put(c, k + 1);
                    i++;
                }
            } else {
                map.put(c, 1);
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
