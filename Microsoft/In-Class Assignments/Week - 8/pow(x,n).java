class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
            n=-1*n;
            return helper(x,n);
        } 
        return helper(x,n);
    }
        public double helper(double x,int n){
            if(n==0){
                return 1;
            }
            else if(n%2!=0){
                return x*helper(x*x,n/2);
            }
            else{
                return helper(x*x,n/2);
            }
        }
    
}
