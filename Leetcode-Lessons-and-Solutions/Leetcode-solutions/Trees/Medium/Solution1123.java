Intuition
Create list of each leaf list.
Find longest.
if there are more than 1 longest list, find first common elemets from the left and return it.
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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        List<List<TreeNode>> roadLists = new ArrayList<>(); 

            drawPath(root, new ArrayList<TreeNode>(), roadLists);
           

            Collections.sort(roadLists, new Comparator<List<TreeNode>>(){

                    @Override 
                    public int compare(List<TreeNode> list1, List<TreeNode> list2){
                        return list2.size() - list1.size();
                    }

            });
             
            int n=1;
            for(int i=0; i<roadLists.size()-1; i++){
                if(roadLists.get(i).size()==roadLists.get(i+1).size()){
                    n++;
                } else break;
            }

            if(n==1) return roadLists.get(0).get(roadLists.get(0).size()-1);
            for(int i=roadLists.get(0).size()-1; i>=0; i--){
                boolean b=true;
                for(int j=0; j<n-1; j++){
                    if(roadLists.get(j).get(i)!=roadLists.get(j+1).get(i)) {
                        b = false;
                        break;
                    }
                }
                if(b) return roadLists.get(0).get(i);

            }           
            return root;
    }

    private void drawPath(TreeNode root,List<TreeNode> currentPath,  List<List<TreeNode>> roadLists){
        if(root == null) return;

        if(root.left==null && root.right==null) {
            List<TreeNode> list1 = new ArrayList<>();
            list1.addAll(currentPath);
            list1.add(root);
            roadLists.add(list1);
            currentPath.add(root);
        } else{
            currentPath.add(root); 

        }

        drawPath(root.left, currentPath, roadLists);
        
        drawPath(root.right, currentPath, roadLists);

        currentPath.remove(root);
    }
}
