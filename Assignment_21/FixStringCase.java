package Assignment_21;

public class FixStringCase {
    public static String solve(final String str) {
        int c1 = 0;
        int c2 = 0;
        
        for(char c : str.toCharArray()){
          if(c >= 'A' && c <= 'Z') c1++;
          if(c >= 'a' && c <= 'z') c2++;
        }
        
          return c1 > c2 ? str.toUpperCase() : str.toLowerCase(); //your code here
      }
}
