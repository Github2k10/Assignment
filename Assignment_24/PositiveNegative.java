package Assignment_24;

public class PositiveNegative {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        if(nums[0] > 0 || nums[n - 1] < 0) return n;
        if(nums[0] == 0 && nums[n - 1] == 0) return 0;
        int i = search(0, n, nums);
        int p = i;

        if(nums[p] == 0){
            while(nums[p] == 0 && p < n - 1) p++;
        }
        i--;

        System.out.println(i);
        System.out.println(p);
        return i + 1 > n - p ? i + 1 : n - p;
    }

    private int search(int s, int e, int[] arr){
        if(s < e){
            int m = s + (e - s)/2;

            if(arr[m] >= 0) return search(s, m, arr);
            else return search(m + 1, e, arr);
        }

        return s;
    }
}
