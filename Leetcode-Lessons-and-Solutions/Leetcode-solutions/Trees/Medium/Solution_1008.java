class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);

        for(int i = 1; i < preorder.length; i++)
            addElementToTree(root, preorder[i]);
        
        return root;      
    }

    private void addElementToTree(TreeNode root, int n){
        if(root == null) return;

        while(true){
            if(root.val > n){
                if(root.left == null) {
                    root.left = new TreeNode(n);
                    break;
                } else{
                    root = root.left;
                }
            }else {
                if(root.right == null){
                    root.right = new TreeNode(n);
                    break;
                }else{
                    root = root.right;
                }
            }
        }
    }
    
}
