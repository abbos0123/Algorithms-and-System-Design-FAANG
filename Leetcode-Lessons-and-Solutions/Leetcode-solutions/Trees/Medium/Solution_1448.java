class Solution {
    private int count = 0;

    public int goodNodes(TreeNode root) {
        path(root, new ArrayList());
        return count;
    }

    private void path(TreeNode root, List<Integer> pathList){
        if(root == null) return;
        pathList.add(root.val);

        count++;
        for(int i = 0; i < pathList.size(); i++){
            if(pathList.get(i) > root.val){
                count --;
                break;
            }
        }

        if(root.left != null){
             path(root.left, pathList);
             pathList.remove((Integer)root.left.val);
        }

        if(root.right != null){
             path(root.right, pathList);
              pathList.remove((Integer)root.right.val);
        }
    }


}
