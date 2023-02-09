public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        
        List<TreeNode> list = new ArrayList();
        convert(root,list);
        int sum = list.get(0).val, n = list.size();

        for(int i = 1; i < n; i++){
           sum +=list.get(i).val;
           list.get(i).val = sum;
        }

        return root;
    }

    private void  convert(TreeNode root, List<TreeNode> list){
        if(root == null) return;
        convert(root.right, list);
        list.add(root);
        convert(root.left, list);
    }
}
