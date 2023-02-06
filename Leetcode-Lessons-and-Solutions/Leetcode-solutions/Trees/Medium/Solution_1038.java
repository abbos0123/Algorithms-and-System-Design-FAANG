class Solution {
    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        updateTree(root);
        return root;
    }

     public void updateTree(TreeNode root) {
        if(root == null) return;
        
        updateTree(root.right);
        sum += root.val;
        root.val = sum;
    
        updateTree(root.left);
    }
}
