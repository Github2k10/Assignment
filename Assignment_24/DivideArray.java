package Assignment_24;

public class DivideArray {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[500 + 1];
        for(int i : nums) arr[i]++;
        for(int i : arr) if(i % 2 != 0) return false;
        return true;
    }
}
