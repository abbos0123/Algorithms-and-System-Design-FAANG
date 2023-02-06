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
    int level = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        sumHelper(root, 0);
        return sum;
    }

    public void sumHelper(TreeNode root, int k){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(k == level)
            sum += root.val;
            else if(k > level){
                sum = root.val;
                level = k;
            }
        }

        sumHelper(root.left, k+1);
        sumHelper(root.right, k+1);
    }
}
