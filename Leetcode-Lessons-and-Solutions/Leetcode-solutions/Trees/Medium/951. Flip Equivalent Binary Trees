class Solution {
    private int k = 0;
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        if(root1.val != root2.val){
            return false;
        }

        if(root1.left != null && root1.right != null && (root2.left == null || root2.right == null) ||
           root2.left != null && root2.right != null && (root1.left == null || root1.right == null))
           return false;

        if(root1.left == null && root2.left == null)
           return flipEquiv(root1.right, root2.right);

        if(root1.right == null && root2.right == null)
           return flipEquiv(root1.left, root2.left);  

        if(root1.left != null && root2.left != null){
            if(root1.left.val == root2.left.val){
                return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
            }else{
                return flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
            }
        }

        if(root1.left != null && root2.left == null || root1.right != null && root2.right == null) 
           return flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);

        return true;  
    }
}
