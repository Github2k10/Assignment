package Assignment_28;

public class Problem01 {
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    if (k <= 1)
      return 0;

    int i = 0, p = 1, c = 0;

    for (int j = 0; j < nums.length; j++) {
      p *= nums[j];

      while (p >= k) {
        p /= nums[i];
        i++;
      }

      c += j - i + 1;
    }

    return c;
  }
}
