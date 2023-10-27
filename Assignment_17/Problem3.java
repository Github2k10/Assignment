package Assignment_17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Problem3 {
    public static void name(){
        "abc".com
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter space separated elemets: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr.length;
        
        for(int i = 0, j = n - 1; i < n / 2; i++, j--){
            int maxI = j, minI = i, max = arr[j], min = arr[i];
            int k = i;
            while(k < j){
                if(arr[minI] > arr[k]){
                    minI = k;
                }

                if(arr[maxI] < arr[k]){
                    maxI = k;
                }
                k++;
            }

            if(minI != i){
                int t = arr[i];
                arr[i] = arr[maxI];
                arr[minI] = t;
            }

            if(maxI != j){
                int t = arr[j];
                arr[j] = arr[maxI];
                arr[maxI] = t;
            }
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
