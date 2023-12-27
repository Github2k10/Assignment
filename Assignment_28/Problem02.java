package Assignment_28;

import java.util.HashMap;
import java.util.Map;

public class Problem02 {
  public int findPairs(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int c = 0;
    for (int i : nums)
      map.put(i, map.getOrDefault(i, 0) + 1);

    for (Map.Entry<Integer, Integer> m : map.entrySet()) {
      int a = m.getKey();
      int v = m.getValue();

      if (k > 0 && map.containsKey(a + k))
        c++;
      else if (k == 0 && v > 1)
        c++;
    }

    return c;
  }
}
