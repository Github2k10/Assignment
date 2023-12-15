package Assignment_26;

public class Problem02 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];

        for (char ch : ransomNote.toCharArray()) {
            map[ch - 'a']++;
        }

        for (char ch : magazine.toCharArray()) {
            map[ch - 'a']--;
        }

        for (int i : map) {
            if (i > 0) {
                return false;
            }
        }

        return true;
    }
}
