public class Solution{
public int maxDistance(int[][] grid) {
        int c=0;
        Queue<int[]> nm=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    nm.add(new int[]{i,j,0});
                }
            }
        }
        int p=-1;
        int d[][]= {{0,1}, {0,-1}, {1,0}, {-1,0}};
        while(!nm.isEmpty())
        {
            int a[]=nm.poll();
            for(int m[]: d)
            {
                int x=m[0]+a[0];
                int y=m[1]+a[1];
                p=Math.max(p,a[2]);
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==0)
                {
                    nm.offer(new int[]{x,y,a[2]+1});
                    grid[x][y]=1;
                }
            }
        }
        return p>0 ? p : -1;
    }
}
