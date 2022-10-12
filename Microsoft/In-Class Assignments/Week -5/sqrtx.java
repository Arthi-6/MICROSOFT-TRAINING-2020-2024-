class Solution {
    public int mySqrt(int x) {
        int start = 1,end = x/2;
        if(x<2){
            return x;
        }
        // int mid = (start+end)/2;
            while(start<=end){
                int mid = (start+end)/2;
                if((long)mid*mid > x){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        
        return end;
    }
}
