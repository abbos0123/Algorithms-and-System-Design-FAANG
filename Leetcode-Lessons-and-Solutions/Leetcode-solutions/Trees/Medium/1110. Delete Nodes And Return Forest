class Solution {
    int k = 0;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> roots = new LinkedList();
        roots.add(root);

        for(int i : to_delete)
            deleteHelper(roots, i);
        
        return roots;
    }

    private void deleteHelper(List<TreeNode> roots, int n){
        for(TreeNode root: roots){
            k = 0;
            delete(roots, root, root, n);

            if(k == 1)
              break;
        }
    }

    private void delete(List<TreeNode> roots, TreeNode root, TreeNode parent, int n){
        if(root == null) return;
        
        if(root.val == n){
            roots.remove(root);

            if(root.left != null)
                roots.add(root.left);   

            if(root.right != null)
            roots.add(root.right);

            root.left = null;
            root.right = null;

            if(parent != root){
               if(parent.left == root)
                  parent.left = null;
              
                if(parent.right == root)
                  parent.right = null;
            }

            k = 1;
            return;
        }

        delete(roots, root.left, root, n);
        delete(roots, root.right, root, n);
    }
}
