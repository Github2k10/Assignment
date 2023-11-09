package Assignment_23;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
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
