class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new LinkedList();

        readTree(root1, list);
        readTree(root2, list);

        Collections.sort(list);
        return list;
    }

    private void readTree(TreeNode root, List<Integer> list){
        if(root == null) return;
        readTree(root.left, list);
        list.add(root.val);
        readTree(root.right, list);
    }

}
