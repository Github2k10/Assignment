package Assignment_26;

import java.util.*;

public class Problem03 {
    public boolean containsDuplicate(int[] nums) {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int i : nums){
                set.add(i);
            }
    
            return set.size() != nums.length;
        }
    }
}
