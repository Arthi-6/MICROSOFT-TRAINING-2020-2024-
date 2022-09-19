class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] files = path.split("/");
        String str = "";
        for(int i=0;i<files.length;i++){
            if(files[i].equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!(files[i].equals(".")) && !(files[i].equals("..")) && !(files[i].equals("")))
            {
                stack.push(files[i]);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }implify path.java
        
         while(!(stack.isEmpty())){
            str="/"+stack.pop()+str;
        }
        return str;
    }
}
