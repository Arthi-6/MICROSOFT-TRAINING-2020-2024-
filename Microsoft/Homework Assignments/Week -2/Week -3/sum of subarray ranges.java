class Solution {
    public long subArrayRanges(int[] nums) {
        long ans=0;
    for(int i=0;i<nums.length;i++)
    { 
        int smin=nums[i];
        int smax=nums[i];
        for(int j=i+1;j<nums.length;j++)
        {
            smin = Math.min(smin,nums[j]);
            smax =Math.max(smax,nums[j]) ;
            ans+=(smax-smin);
            
        }
    }    
       return ans;
        
        }
}
