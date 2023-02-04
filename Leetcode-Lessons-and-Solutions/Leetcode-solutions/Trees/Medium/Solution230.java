Intuition
If we collect all node valus in orderly, we can build list accending order. Then retrun k-1 indexed element from list.

Complexity
Time complexity: O(n)
Space complexity: O(n)
Code
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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new LinkedList();
        collectList(root, list);
        return list.get(k-1);
    }

    private void collectList(TreeNode root, List<Integer> list){
        if(root == null) return;
        
        collectList(root.left,list);
        list.add(root.val);
        collectList(root.right, list);
    }
}
