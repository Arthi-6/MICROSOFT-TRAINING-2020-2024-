public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0, nums.length-1) ;
    }

    private TreeNode helper(int[] nums, int left, int right){
        if (left > right) return null;
        int m = (right + left) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(nums, left, m - 1);
        root.right = helper(nums, m + 1, right);
        return root;
    }
