class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] indices = new int[2];
   // int count =0;
   
    Map<Integer, Integer> map = new HashMap<>();
    
    //while(count ==0)
    // {
    for (int index = 0; index < nums.length; index++) {
        
        if (map.containsKey(target - nums[index])) {
            indices[1] = index;
            indices[0] = map.get(target - nums[index]);
            // count++;
            return indices;
        }
        else{
        map.put(nums[index], index);
        }
    }
    // }
    return indices;
}

    }
