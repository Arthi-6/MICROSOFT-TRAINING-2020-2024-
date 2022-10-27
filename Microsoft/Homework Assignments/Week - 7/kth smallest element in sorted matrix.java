class Solution {
   public int kthSmallest(int[][] matrix, int k) {
       /*  int r = matrix.length;
         int c = matrix[0].length;
         int[] arr = new int[r*c];
         int ind=0;
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                 arr[ind] = matrix[i][j];
                 ind++;
             }
         }
         Arrays.sort(arr);
     return arr[k-1];*/
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
       int r = matrix.length;
       int c = matrix[0].length;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               pq.add(matrix[i][j]);
           }
       }
       while(pq.size()>k){
           pq.poll();
       }
       return pq.peek();
   }
    
}
