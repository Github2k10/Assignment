package Assignment_28;

import java.util.HashMap;
import java.util.Map;

public class Problem02 {
  public int findPairs(int[] nums, int k) {
    Arrays.sort(nums);

    int i = 0, j = 1, c = 0, n = nums.length;

    while (i < n && j < n) {
      if (i == j || nums[j] - nums[i] < k)
        j++;
      else if (nums[j] - nums[i] > k)
        i++;
      else {
        i++;
        c++;
        while (i < n && nums[i] == nums[i - 1])
          i++;
      }
    }

    return c;

  }
}
