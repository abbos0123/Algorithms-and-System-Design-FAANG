Approach

collect sum of all subtree elements to hash table;
find most friquent sums in table.
collect all most friquest elements to List;
convert list to array;
return array;

Complexity

Time complexity: O(n + 2k + l)
n number of node elements
k number of elements in hashtable
l number of max friequent sums

Space complexity: O ( k + l)
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
    HashMap<Integer, Integer> table;
    public int[] findFrequentTreeSum(TreeNode root) {
        table = new HashMap();
        List<Integer> list = new LinkedList();
        int[] res;
        int max = 0, pos = -1;
       
        sum(root);

        for(int key : table.keySet())
           max = Math.max(max, table.get(key));
        
        for(int key : table.keySet())
            if(table.get(key) == max)
                list.add(key);
        
        res = new int[list.size()];
      
        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(i);

        return res;
    }

    private int sum(TreeNode root){
        if(root == null) return 0;

        int sum = root.val + sum(root.left) + sum(root.right);
        table.put(sum, table.getOrDefault(sum, 0) + 1);

        return sum;
    }
}
