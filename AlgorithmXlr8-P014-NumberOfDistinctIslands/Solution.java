/* 
track group of 1's, add them set
dfs traversal
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your solution here.
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] grid=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        sc.close();

        System.out.println(helper(m, n, grid));
    }
    public static int helper(int m, int n, int[][] grid){
        HashSet<String> set=new HashSet<>();
        boolean[][] vis=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    StringBuilder sb=new StringBuilder();
                    dfs(i, j, i, j, sb, vis, grid);
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }
    public static void dfs(int row, int col, int baseRow, int baseCol, StringBuilder sb, boolean[][] vis, int[][] grid){
        vis[row][col]=true;
        int m=grid.length;
        int n=grid[0].length;

        sb.append((row-baseRow)+","+(col-baseCol)+" ");

        int[] dirRow={-1, 0, 0, 1};
        int[] dirCol={0, -1, 1, 0};

        for(int i=0;i<4;i++){
            int x=row+dirRow[i];
            int y=col+dirCol[i];
            if(x<m && x>=0 && y<n && y>=0 && !vis[x][y] && grid[x][y]==1){
                dfs(x, y, baseRow, baseCol, sb, vis, grid);
            }
        }
    }
}
