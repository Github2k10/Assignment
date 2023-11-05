package Assignment_21;

public class ArrayPlus {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for(int i : arr1) sum += i;
        for(int i : arr2) sum += i;
        return sum;
      }
}
