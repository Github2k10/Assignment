import java.util.*;

public class InsertionSortOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter elements of array: ");
        String[] arr = sc.nextLine().split(" ");

        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static void insertionSort(String[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            String key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j].compareTo(key) > 0){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
