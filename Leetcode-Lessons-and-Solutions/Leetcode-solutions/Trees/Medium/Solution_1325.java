class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        trim(root, target);

        if(root.left == null && root.right == null && root.val == target)
          root = null;

        return root;
    }

   private void trim(TreeNode root, int target){
       if(root == null ) return;

       trim(root.left, target); 
       trim(root.right, target);
       if(root.left != null &&root.left.left == null 
          && root.left.right == null && root.left.val == target) root.left = null;

        if(root.right != null && root.right.left == null 
            && root.right.right == null && root.right.val == target) root.right = null;
   }
}
