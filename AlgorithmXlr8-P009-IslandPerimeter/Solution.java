import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your solution here.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] grid=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println(islandPerimeter(n, m, grid));
    }
    public static int islandPerimeter(int n, int m, int[][] grid){
        int cntIslands=0;
        int connectedEdges=0;

        int[] dirRow={-1, 0, 0, 1};
        int[] dirCol={0, -1, 1, 0};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    cntIslands++;
                    for(int k=0;k<4;k++){
                        int x=i+dirRow[k];
                        int y=j+dirCol[k];
                        if(x<n && x>=0 && y<m && y>=0 && grid[x][y]==1){
                            connectedEdges++;
                        }
                    }
                }
            }
        }

        int res=(4*cntIslands)-connectedEdges;
        return res;
    }
}






