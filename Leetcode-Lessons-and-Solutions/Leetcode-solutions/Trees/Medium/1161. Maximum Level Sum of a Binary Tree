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
    public int maxLevelSum(TreeNode root) {
        List<Integer> list = new LinkedList();
        Queue<TreeNode> queue = new LinkedList();
        int max = Integer.MIN_VALUE;
        int index = 0;

        queue.add(root);

        while(!queue.isEmpty()){
            int currSize = queue.size();
            int sum = 0;

            while(currSize > 0){
                currSize --;
                TreeNode curElem = queue.poll();
                sum += curElem.val;

                if(curElem.left != null)
                  queue.offer(curElem.left);

                if(curElem.right != null)
                  queue.offer(curElem.right);
            }

            list.add(sum);
        }


        for(int i = 0; i < list.size(); i++)
            if(max < list.get(i)){
                max = list.get(i);
                index = i;
            }
        
        return index+1;
    }
}
