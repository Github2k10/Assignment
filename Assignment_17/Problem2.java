package Assignment_17;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter space separated elemets: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int min = i;

            for(int j = i + 1; j < n; j++)
                if(arr[j] < arr[min]) min = j;

            int k = arr[min];

            while(min > i){
                arr[min] = arr[min - 1];
                min--;
            }

            arr[i] = k;
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
