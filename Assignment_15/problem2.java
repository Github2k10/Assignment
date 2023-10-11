package Assignment_15;

//  Question 2: Calculate the sum of all elements in an array of integers in Java.

public class problem2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 6, 7, 8};

        System.out.println("Sum of elements of array: " + findSum(arr));
    }

    private static int findSum(int[] arr){
        int sum = 0;
        for(int i : arr) sum += i;
        return sum;
    }
}
