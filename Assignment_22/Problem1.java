package Assignment_22;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 8};
        int[] arr2 = {3, 5, 6, 7, 9};
        int[] arr = merge(arr1, arr2);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length, m = arr2.length;
        int[] out = new int[n + m];
        int i = 0, j = 0, k = 0;

        while(i < n || j < m){
            if(i < n && j < m){
                if(arr1[i] < arr2[j]){
                    out[k++] = arr1[i++];
                } else {
                    out[k++] = arr2[j++];
                }
            } else if(i < n){
                out[k++] = arr1[i++];
            } else {
                out[k++] = arr2[j++];
            }
        }

        return out;
    }
}
