package Assignment_17;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element space separated: ");
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j].compareTo(arr[j + 1]) > 0){
                    String s = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = s;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
