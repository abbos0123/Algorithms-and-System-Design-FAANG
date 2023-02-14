class Solution {
    List<Integer> res = new ArrayList();
    TreeNode root;
    boolean b = false;
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList();
        build(label);
        read(root, label, list);
        return res;
    }

    private void read(TreeNode root, int target, List<Integer> list){
        if(root == null || b) return;

        if(target == root.val){
            list.add(root.val);
            res.addAll(list);
            b = true;
            return;
        }

        list.add(root.val);

        read(root.left, target, list);
        read(root.right, target, list);
        list.remove((Integer) root.val);
    }
   
    private void build(int k){
        Stack<TreeNode> steak1 = new Stack();
        Stack<TreeNode> steak2 = new Stack();
        root = new TreeNode(1);

        int n = 1;
        int cur = 1;

        steak1.push(root);
       
        while(cur <= k){
            if(n % 2 == 1){
                while(!steak1.isEmpty()){
                    TreeNode node = steak1.pop();
                    cur++;
                    node.right = new TreeNode(cur);
                    cur++;
                    node.left = new TreeNode(cur);

                    steak2.push(node.right);
                    steak2.push(node.left);
                }
            }else{
                 while(!steak2.isEmpty()){
                    TreeNode node = steak2.pop();
                    cur++;
                    node.left = new TreeNode(cur);
                    cur++;
                    node.right = new TreeNode(cur);

                    steak1.push(node.left);
                    steak1.push(node.right);
                }
            }
            n++;
        }
    }
}
