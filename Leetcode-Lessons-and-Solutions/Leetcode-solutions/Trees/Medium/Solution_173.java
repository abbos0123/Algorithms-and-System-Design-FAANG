Intuition

1. Read inorder all elements and collect them to queue
2. poll queue to get next element if queue is empty return -1
3. If queue is empty, this means there is no next element

Complexity
 1. Time complexity: O(n)
 2. Space complexity: O(n)

   
   
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
 
 
class BSTIterator {
    Queue<TreeNode> queue;
    public BSTIterator(TreeNode root) {
       queue = new LinkedList();
       add(root);
    }

    private void add(TreeNode root){
        if(root == null) return;

        add(root.left);
        queue.add(root);
        add(root.right);
    }

    public int next() {
        if(queue.isEmpty()) return -1;
        return queue.poll().val;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
