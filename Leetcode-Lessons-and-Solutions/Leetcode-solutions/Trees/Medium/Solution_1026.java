class Solution {
    int max = 0;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null) return max;
        maxHelper(root, root.val);

        maxAncestorDiff(root.left);
        maxAncestorDiff(root.right);

        return max;
    }

    private void maxHelper(TreeNode elem, int rootVal){
        if(elem == null) return;

        max = Math.max(max, Math.abs(elem.val - rootVal));
        maxHelper(elem.left, rootVal);
        maxHelper(elem.right, rootVal);
    }
}
