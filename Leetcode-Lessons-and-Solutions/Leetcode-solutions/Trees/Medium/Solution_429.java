/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList();

        show(root, list, 0);
       
        return list;
    }

    private void show(Node root, List<List<Integer>> list, int level){
        if(root == null) return;

        if(list.size() == level)
        list.add(new LinkedList<Integer>());

        list.get(level).add(root.val);

        for(Node cur: root.children)
        show(cur, list, level+1);
    }
}
