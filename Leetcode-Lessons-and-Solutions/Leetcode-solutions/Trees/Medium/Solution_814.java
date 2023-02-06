class Solution {
    
    public TreeNode pruneTree(TreeNode root) {
        delete(root);

        if(root.left == null && root.right == null && root.val != 1) return null;
        return root;
    }

    private void delete(TreeNode root){
        if(root == null) return;

        delete(root.left);
        delete(root.right);

        if(root.left != null && root.left.left == null && 
        root.left.right == null && root.left.val != 1) root.left = null;

        if(root.right != null && root.right.left == null &&
        root.right.right == null && root.right.val != 1) root.right = null;
    }

}
