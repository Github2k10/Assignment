package Assignment_26;

public class Problem01 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0, n - k - 1, nums);
        reverse(n - k, n - 1, nums);
        reverse(0, n - 1, nums);
    }

    private void reverse(int s, int e, int[] arr){
       while(s <= e){
            swap(s, e, arr);
            s++;
            e--;
        }
    }

    private void swap(int i, int j, int[] arr){
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }
}
