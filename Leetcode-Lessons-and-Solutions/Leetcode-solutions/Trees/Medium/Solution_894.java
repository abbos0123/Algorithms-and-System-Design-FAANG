class Solution {
   public List<TreeNode> allPossibleFBT(int n) {
      if (n <= 0 || n % 2 == 0) return new ArrayList<>();
      
      List<TreeNode> res = new ArrayList<>();
      
      if ( n== 1){
          res.add(new TreeNode());
          return res;
      }
      
      for (int i = 1; i < n; i += 2){
          List<TreeNode> leftSubTree = allPossibleFBT(i);
          List<TreeNode> rightSubTree = allPossibleFBT(n-i-1);
          for (TreeNode l: leftSubTree){
              for (TreeNode r: rightSubTree){
                  TreeNode root = new TreeNode(0);
                  root.left = l;
                  root.right = r;
                  res.add(root);
              }
          }
      }
      return res;
    }
}
