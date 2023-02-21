class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode cur = root;

        while(true){
            if(cur.val > val){
                if(cur.left == null){
                    cur.left = new TreeNode(val);
                    break;
                }else{
                    cur = cur.left;
                }
            }else{
                if(cur.right == null){
                    cur.right = new TreeNode(val);
                    break;
                }else{
                    cur = cur.right;
                }
            }
        }

        return root;
    }

}
