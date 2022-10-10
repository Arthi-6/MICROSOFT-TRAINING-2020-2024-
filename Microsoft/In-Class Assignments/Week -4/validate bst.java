class Solution{
public boolean isValidBST(TreeNode root) {
      return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root,long start,long end){
        if(root==null){
            return true;
        }
        if(start<root.val && end>root.val){
            return valid(root.left,start,root.val)&&  valid(root.right,root.val,end);
        }
        return false;
    }
}
