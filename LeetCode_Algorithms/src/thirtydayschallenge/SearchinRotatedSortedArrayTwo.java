package thirtydayschallenge;

public class SearchinRotatedSortedArrayTwo {

    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return false;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(target == nums[mid]) return true;

            if(nums[low] < nums[mid]) {
                if(nums[low] <= target && target < nums[mid])
                    high = mid -1;
                else
                    low = mid + 1;
            }else if(nums[low] > nums[mid]){
                if(nums[mid] < target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            } else {
                low ++;
            }
        }

        return false;
    }


}
