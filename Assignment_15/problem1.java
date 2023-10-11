package Assignment_15;

//  Question 1: Find the maximum element in an array of integers in Java.

public class problem1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 4, 6, 9};

        System.out.println("Max Element for the array: " + findMax(arr));
    }

    private static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i : arr)
            if(i > max)
                max = i;

        return max;
    }
}