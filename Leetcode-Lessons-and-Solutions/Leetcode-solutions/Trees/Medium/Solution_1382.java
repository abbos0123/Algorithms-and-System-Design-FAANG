class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        int l, r;
        readTree(root, list);
        if(list.size() == 0) return null;

        l = 0;
        r = list.size() - 1;

        return construct(list, l, r);
    }

    private TreeNode construct(List<Integer> list, int l, int r){
        if(l > r) return null;
        int mid = (r + l) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = construct(list, l, mid - 1);
        root.right = construct(list, mid + 1, r);

        return root;
    }

    private void readTree(TreeNode root, List<Integer> list){
        if(root == null) return;

        readTree(root.left, list);
        list.add(root.val);
        readTree(root.right, list);
    }
}
