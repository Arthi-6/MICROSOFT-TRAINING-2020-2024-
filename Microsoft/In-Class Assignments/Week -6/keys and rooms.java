class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] arr = new boolean[rooms.size()];
        arr[0]=true;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        while(!st.isEmpty()){
            for(int key : rooms.get(st.pop())){
                if(arr[key]==false){
                    arr[key]=true;
                    st.push(key);
                    System.out.println(st);
                }
            }
        }
        
        
        for(boolean visited : arr){
            if(visited==false){
                return false;
            }
        }
        return true;
    }
}
