package thirtydayschallenge;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0) return 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum-k))
                count += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {-1, -1, 1};
        int res = new SubarraySumEqualsK().subarraySum(a, 0);
        System.out.print(res);
    }
}