class Solution {
     public Node construct(int[][] grid) {
        return make(grid, 0, 0, grid.length);
    }
    private Node make(int grid[][], int r, int c, int length) {
        if(length == 1)
            return new Node(grid[r][c] == 1? true : false, true);
        Node topLeft = make(grid, r, c, length/2);
        Node topRight = make(grid, r, c + length/2, length/2);
        Node bottomLeft = make(grid, r + length/2, c, length/2);
        Node bottomRight = make(grid, r + length/2, c + length/2, length/2);
        if(topLeft.val == topRight.val && bottomLeft.val == bottomRight.val && topLeft.val == bottomLeft.val && topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf)
            return new Node(topLeft.val, true);
        else
            return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}
