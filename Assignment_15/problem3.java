package Assignment_15;

//  Question 3: Check if an array of integers is sorted in non-decreasing order in Java.

public class problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Is array is sorted: " + checkSortedArray(arr));
    }

    private static boolean checkSortedArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]) return false;
        }

        return true;
    }
}
