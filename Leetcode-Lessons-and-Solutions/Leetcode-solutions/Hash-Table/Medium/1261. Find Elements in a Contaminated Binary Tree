class FindElements {
    TreeNode root;
    boolean res = false;
    public FindElements(TreeNode root) {
        this.root = root;
        root.val = 0;
        recover(root);
    }

    private void recover(TreeNode root){
        if(root == null) return;

        if(root.left != null)
            root.left.val = 2 * root.val + 1;
        
        if(root.right != null)
            root.right.val = 2 * root.val + 2;
        
        recover(root.left);
        recover(root.right);
    }

    
    public boolean find(int target) {
        find(root, target);
        if(res){
            res = false;
            return true;
        }else{
            return false;
        }
    }

    private void find(TreeNode root, int target){
        if(root == null || res) return;

        if(root.val == target){
            res = true;
        }else{
            find(root.left, target);
            find(root.right, target);
        }
        
    }
}
