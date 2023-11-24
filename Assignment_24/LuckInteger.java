package Assignment_24;

public class LuckInteger {
    public int findLucky(int[] arr) {
        int m = 0;
        for(int i : arr) {
            if(i > m) {
                m = i;
            }
        }

        int[] ans = new int[m + 1];

        for(int i : arr){
            ans[i]++;
        }

        int n = -1;
        for(int i = 1; i < ans.length; i++){
            if(ans[i] == i) n = i;
        }

        return n;
    }
}
