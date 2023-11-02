package Assignment_20;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 1, 5, 2, 1, 3, 4};
        int[] ans = {-1, -1};
        helper(arr, 0, arr.length - 1, ans, 1);
        System.out.println("first occurrence: " + ans[0] + ", last occurrence: " + ans[1]);
    }

    private static void helper(int[] arr, int i, int j, int[] ans, int t){
        if(i >= arr.length) return;
        if(j < 0) return;
        if(ans[0] != -1 && ans[1] != -1) return;

        if(arr[i] == t && ans[0] == -1) ans[0] = i;
        if(arr[j] == t && ans[1] == -1) ans[1] = j;

        helper(arr, i + 1, j - 1, ans, t);
    }
}
