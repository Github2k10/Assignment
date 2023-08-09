import java.util.Arrays;
import java.util.Scanner;

public class FindingTheMaximumElement {
    static int findMax(int... numbs){
        int max = Integer.MIN_VALUE;

        for(int i : numbs) {
            if(i > max)
                max = i;
        }

        return  max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter elements: ");
        int[] numbs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxNumber = findMax(numbs);

        System.out.println("Maximum element: " + maxNumber);

        sc.close();
    }
}
