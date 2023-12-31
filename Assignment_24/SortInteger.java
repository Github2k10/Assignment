package Assignment_24;

import java.util.Arrays;
import java.util.Scanner;

public class SortInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sortByBits(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = binary(arr[i]);
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(ans[j] > ans[j + 1]){
                    swap(ans, j, j + 1);
                    swap(arr, j, j + 1);
                } else if(ans[j] == ans[j + 1]){
                    if(arr[j] > arr[j + 1]){
                        swap(ans, j, j + 1);
                        swap(arr, j, j + 1);
                    }
                }
            }
        }

        return arr;
    }

    private static int binary(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int t = n % 2;
        return t + binary(n/2);
    }

    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
