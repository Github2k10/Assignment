package Assignment_20;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(helper("abcdabcdddsdt"));
    }

    private static String helper(String str){
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray())
            set.add(c);

        StringBuilder sb = new StringBuilder();
        for(char c : set) sb.append(c);

        return sb.toString();
    }
}
