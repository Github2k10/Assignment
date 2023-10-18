package Assignment_16;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter elements separated by space: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
