public class Problem2 {
  public void nextPermutation(int[] nums) {
    int i = nums.length - 2;

    while(i >= 0 && nums[i + 1] <= nums[i]) i--;

    if(i >= 0){
        int j = nums.length - 1;
        while(nums[j] <= nums[i]) j--;
        swap(nums, i, j);
    }
    reverse(nums, i + 1);
}

private void reverse(int[] nums, int i){
    int j = nums.length - 1;

    while(i < j){
        swap(nums, i, j);
        i++;
        j--;
    }
}

private void swap(int[] arr, int i, int j){
    int k = arr[i];
    arr[i] = arr[j];
    arr[j] = k;
}
}
