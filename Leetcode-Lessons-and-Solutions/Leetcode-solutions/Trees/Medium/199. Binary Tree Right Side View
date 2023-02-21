class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList();
        rightView(root, list, 1);

        return list;
    }

    private void rightView(TreeNode root, List<Integer> list, int level){
        if(root == null) return;

        if(list.size() < level){
            list.add(root.val);
        }

        rightView(root.right, list, level+1);
        rightView(root.left, list, level+1);
    }
}
