import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = findMax(arr);

        System.out.println("Maximum element from the array: " + max);

        sc.close();
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
            if(arr[i] > max)
                max = arr[i];

        return max;
    }
}
