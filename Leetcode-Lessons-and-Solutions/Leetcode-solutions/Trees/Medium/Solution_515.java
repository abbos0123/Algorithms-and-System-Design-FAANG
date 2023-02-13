Approach
  Using preorder traversal and collecting max elements of each level in the list. 
  Each time when we visit to the element of tree we compare the proper level element in the list. 
  If current node value in the tree greater than element which represents this level's max element in list, just replace it with node value.

Complexity
  Time complexity: O(n)
  Space complexity: O(n)
  
Code

class Solution {
     List<Integer> list;
    public List<Integer> largestValues(TreeNode root) {
       list = new LinkedList();
       find(root, 0);

       return list;
    }

    private void find(TreeNode root, int level){
        if(root == null) return;

        if(list.size() == level)
          list.add(root.val);
        else
          list.set(level, Math.max(list.get(level), root.val));

        find(root.left, level + 1);
        find(root.right, level + 1); 
    }
}
