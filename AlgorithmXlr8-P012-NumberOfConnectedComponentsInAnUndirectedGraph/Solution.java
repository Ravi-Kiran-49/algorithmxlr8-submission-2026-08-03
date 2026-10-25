/*
take input
dfs to count no.of components
traversal throught each node if not visited
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your solution here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] edges=new int[m][2];

        for(int i=0;i<m;i++){
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        sc.close();

        System.out.println(helper(n, m, edges));
    }
    public static int helper(int n, int m, int[][] edges){
        boolean[] vis=new boolean[n];
        List<List<Integer>> adj=new ArrayList<>();
        int cnt=0;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for(int i=0;i<n;i++){
            if(!vis[i]) {
                cnt++;
                dfs(i, vis, adj);
            }
        }
        return cnt;
    }
    public static void dfs(int node, boolean[] vis, List<List<Integer>> adj){
        vis[node]=true;

        for(int adjNode : adj.get(node)){
            if(!vis[adjNode]) dfs(adjNode, vis, adj);
        }
    }
}
