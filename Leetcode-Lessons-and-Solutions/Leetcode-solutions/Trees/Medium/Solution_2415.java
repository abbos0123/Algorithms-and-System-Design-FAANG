class Solution {
    int level = -1;
    Map<Integer, List<Integer>> map = new HashMap();

    public TreeNode reverseOddLevels(TreeNode root) {
        readDataInOrder(root, 0);
        writeDataInOrder(root, 0);
        
        return root;
    }

    private void readDataInOrder(TreeNode root, int level){
        if(root == null) return;

        map.putIfAbsent(level, new ArrayList());

        readDataInOrder(root.left, level + 1);
        map.get(level).add(root.val);
        readDataInOrder(root.right, level + 1);
    }
    
     private void writeDataInOrder(TreeNode root, int level){
        if(root == null) return;

        writeDataInOrder(root.right, level + 1);
        
        if(level % 2 == 1){
             var list = map.get(level);
             root.val = list.get(0);
             list.remove(0);
        }

        writeDataInOrder(root.left, level + 1);
    }
}
