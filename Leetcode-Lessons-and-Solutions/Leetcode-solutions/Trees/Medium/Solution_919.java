class CBTInserter {
    private TreeNode root;
    private Queue<TreeNode> q;
    private int index = -1;
  
    public CBTInserter(TreeNode root) {
        this.root = root;
    }
    
    public int insert(int val) {
      q = new LinkedList();
      addElement(val);
      return index;  
    }

    private void addElement(int val){
       q.add(root);

       while(!q.isEmpty()){
           TreeNode node = q.poll();

           if(node.left == null){
               node.left = new TreeNode(val);
               index = node.val;
               return;
           }else q.add(node.left);
           
           if(node.right == null){
               node.right = new TreeNode(val);
               index = node.val;
               return;
           }else q.add(node.right);         
       }
    }
    
    public TreeNode get_root() {
        return root;
    }
}
