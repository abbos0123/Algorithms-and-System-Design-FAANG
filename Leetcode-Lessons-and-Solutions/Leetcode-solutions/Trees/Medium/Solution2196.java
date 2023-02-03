Intuition
I thought just by recursion and lineary search, i can solve this problem. But because of large size, time limit exception occured. Then i decided to collect data to map in order to get elements with constant time.

Approach
1.Collect data to HashMap
2.Find root. Add all des[i][0] parent nodes and remove all des[i][1] child nodes. As the result only Root element remains.
By recursion we can build tree.
3.Return root of the tree.
Complexity

Time complexity: O(n*n)
Space complexity: O(n)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] des) {
        Map<Integer, List<int[]>> map = new HashMap();
        Set<Integer> set = new HashSet();
        TreeNode root = new TreeNode();
        int n =  des.length;


        for(int i = 0; i < n; i++){
            map.putIfAbsent(des[i][0], new ArrayList());
            map.get(des[i][0]).add(des[i]);
            set.add(des[i][0]);
        }

        for(int i =0; i < n; i++)
            set.remove(des[i][1]);

        for(int elem: set)
         root = new TreeNode(elem);
        
        build(root, map);

        return root;    
    }

    private void build(TreeNode root, Map<Integer, List<int[]>> map){
        if(root == null) return;

        List<int[]> list = map.get(root.val);
        if(list == null || list.size() == 0) return;

        for(int i = 0; i < list.size(); i++){
            if(root.left == null && list.get(i)[2] == 1){
                root.left = new TreeNode(list.get(i)[1]);
            }

            if(root.right == null && list.get(i)[2] == 0){
                root.right = new TreeNode(list.get(i)[1]);
            }
        }

        build(root.left, map);
        build(root.right, map);
    }
}
