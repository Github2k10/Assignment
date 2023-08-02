import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list of numbers: ");
        String[] list = sc.nextLine().split(" ");

        int[] numList = new int[list.length];

        for(int i = 0; i < list.length; i++){
            numList[i] = Integer.parseInt(list[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int j : numList) {
            sum += j;

            if (j > max) max = j;
            if (j < min) min = j;
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Average of all elements: " + sum/ numList.length);
        sc.close();
    }
}
