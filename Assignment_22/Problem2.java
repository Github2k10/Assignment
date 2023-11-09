package Assignment_22;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 2, 4, 7, 9, 8, 0};
        System.out.println(Arrays.toString(arr));
        mergeSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int s, int e, int[] arr){
        if(s < e){
            int m = s + (e - s)/2;

            mergeSort(s, m, arr);
            mergeSort(m + 1, e, arr);
            merge(s, m, e, arr);
        }
    }

    private static void merge(int s, int m, int e, int[] arr){
        int[] out = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;
        while(i <= m || j <= e){
            if(i <= m && j <= e){
                if(arr[i] > arr[j]){
                    out[k++] = arr[i++];
                } else {
                    out[k++] = arr[j++];
                }
            } else if(i <= m){
                out[k++] = arr[i++];
            } else {
                out[k++] = arr[j++];
            }
        }

        k = 0;
        for(int a = s; a <= e; a++){
            arr[a] = out[k++];
        }
    }
}
