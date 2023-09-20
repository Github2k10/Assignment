import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = Arrays.stream(arr).sum();
        double avg = Arrays.stream(arr).average().getAsDouble();

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + avg);
        sc.close();
    }
}
