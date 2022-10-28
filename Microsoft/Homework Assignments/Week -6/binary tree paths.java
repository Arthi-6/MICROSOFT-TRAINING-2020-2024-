class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> res = new ArrayList<>();
       if(root==null){
           return res;
       }
       String currPath = Integer.toString(root.val);
       if(root.left==null && root.right==null){
           res.add(currPath);
       }
       
       if(root.left!=null){
           dfs(root.left,currPath,res);
       }
       if(root.right!=null){
           dfs(root.right,currPath,res);
       }
        return res;
    }
    public void dfs(TreeNode node,String currPath,List<String> res){
        currPath = currPath + ("->"+node.val);
        if(node.right==null && node.left==null){
          res.add(currPath);
          return;
        }
        if(node.left!=null){
            dfs(node.left,currPath,res);
        }
        if(node.right!=null){
            dfs(node.right,currPath,res);
        }
    }
}
