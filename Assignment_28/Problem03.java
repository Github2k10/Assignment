package Assignment_28;

import java.util.*;

public class Problem03 {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    Set<List<Integer>> list = new HashSet<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      if (nums[i] > 0)
        break;
      if (i > 0 && nums[i] == nums[i - 1])
        continue;

      int a = i + 1, b = n - 1;
      int k = nums[i];

      while (a < b) {
        int sum = k + nums[a] + nums[b];
        if (sum == 0 && i != a && i != b && a != b) {
          List<Integer> l = new ArrayList<>();
          l.add(k);
          l.add(nums[a]);
          l.add(nums[b]);
          list.add(l);

          a++;
          b--;
        } else if (sum > 0)
          b--;
        else
          a++;
      }
    }

    List<List<Integer>> lt = new ArrayList<>();
    lt.addAll(list);
    return lt;
  }
}
