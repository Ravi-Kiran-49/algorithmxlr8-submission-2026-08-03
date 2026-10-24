import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your solution here.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] rooms=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rooms[i][j]=sc.nextInt();
            }
        }
        sc.close();

        int[][] result=helper(n, m, rooms);

        System.out.println(Arrays.deepToString(result).replace(" ", ""));
    }
    public static int[][] helper(int n, int m, int[][] grid){
        Queue<int[]> q=new LinkedList<>();
        boolean[][] vis=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i, j, 0});
                    vis[i][j]=true; 
                }
                else if(grid[i][j]==-1){
                    vis[i][j]=true;
                }
            }
        }
        
        int[] dirRow={-1, 0, 0, 1};
        int[] dirCol={0, -1, 1, 0};

        while(!q.isEmpty()){
            int row=q.peek()[0];
            int col=q.peek()[1];
            int distance=q.peek()[2];
            q.poll();

            for(int i=0;i<4;i++){
                int x=row+dirRow[i];
                int y=col+dirCol[i];
                if(x>=0 && x<n && y>=0 && y<m && !vis[x][y] && grid[x][y]==Integer.MAX_VALUE){
                    vis[x][y]=true;
                    grid[x][y]=distance+1;
                    q.offer(new int[]{x, y, distance+1});
                }
            }
        }
        return grid;
    }
}
