/*
count edges
build adj list
bfs traversal , vis, if any adjNode already vis(cycle detected)
if there is no cycle & edges==n-1 return true;
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
    public static boolean helper(int n, int m, int[][] edges){
        List<List<Integer>> adj=new ArrayList<>();
        boolean[] vis=new boolean[n];

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
            if(!vis[i]){
                if(isCycle(i, vis, adj)) return false;
            }
        }

        if(n-1!=m) return false;
        return true;
    }
    public static boolean isCycle(int node, boolean[] vis, List<List<Integer>> adj){
        vis[node]=true;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{node, -1});

        while(!q.isEmpty()){
            int curNode=q.peek()[0];
            int parentNode=q.peek()[1];
            q.poll();

            for(int adjNode : adj.get(curNode)){
                if(!vis[adjNode]){
                    vis[adjNode]=true;
                    q.offer(new int[]{adjNode, curNode});
                }
                else if(adjNode!=parentNode){
                    return true;
                }
            }
        }
        return false;
    }
}
