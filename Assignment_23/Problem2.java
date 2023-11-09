package Assignment_23;

import java.util.Arrays;

public class Problem2 {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 7, 4, 8, 3, 9};
        quickSort(0, arr.length - 1, arr);

        System.out.println("Number of comparisons: " + count);
    }

    private static void quickSort(int s, int e, int[] arr){
        if(s < e){
            int pi = pivot(s, e, arr);

            quickSort(s, pi - 1, arr);
            quickSort(pi + 1, e, arr);
        }
    }

    private static int pivot(int s, int e, int[] arr){
        int p = arr[e];
        int i = s;

        for(int j = s; j < e; j++){
            if(arr[j] < p){
                swap(arr, i, j);
                i++;
                count++;
            }
        }
        
        swap(arr, i, e);
        return i;
    }

    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
