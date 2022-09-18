class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int len = nums.length;
        int end = len - 1;
        int mid = len/2;
        while(start<=end && mid>=0 && mid<=len-1){
            if(nums[start]==target){
                return start;
            }
            if(nums[end]==target){
                return end;
            }
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<nums[mid]){
                if(nums[start]<target && target<nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(nums[mid]<target && target<nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            mid = (start + end)/2;
        }
        return -1;
    }
}
