class Solution {
    public int calculate(String s) {
        int len = s.length();
        Stack<Integer> st = new Stack<>();
        char operation = '+';
        int currnum = 0;
        for(int i=0;i<len;i++){
            char currchar = s.charAt(i);
            if(Character.isDigit(currchar)){
                currnum = (currnum*10)+currchar-'0';
            }
            if(!Character.isDigit(currchar) && !Character.isWhitespace(currchar) || i==len-1){
                if(operation == '+'){
                    st.push(currnum);
                }
                else if(operation == '-'){
                    st.push(-1*currnum);
                }
                else if(operation == '*'){
                    st.push(st.pop() * currnum);
                }
                else if(operation == '/'){
                    st.push(st.pop() / currnum);
                }
                operation = currchar;
                currnum = 0;                       
            }
        }
        int res = 0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}
