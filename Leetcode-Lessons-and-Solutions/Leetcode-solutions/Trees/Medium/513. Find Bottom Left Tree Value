Intuition
First of all, we can recursively reach every element of the tree. If we iterate each node with recursion, we read tree from left to right. In order to identify level of each node, we use second argument. One global varaible is used to hold max level of current position. Then if whenever cour current level is strictly higher than golabal max element, then take the value of current node. At the end of the recursion we find the result.

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
    int level = -1;
    int res= -1;
    public int findBottomLeftValue(TreeNode root) {
      readTree(root, 0);
      return res;  
    }

    private void readTree(TreeNode root , int curLevel){
        if(root == null) return;
       
        if(level < curLevel){
            level = curLevel;
            res = root.val;
        }

        readTree(root.left, curLevel + 1);
        readTree(root.right, curLevel + 1);
    }
}
