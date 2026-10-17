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

        int source=sc.nextInt();
        int destination=sc.nextInt();

        sc.close();
        System.out.println(isPossible(n, m, edges, source, destination));
    }
    public static boolean isPossible(int n, int m, int[][] edges, int source, int destination){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        boolean[] vis=new boolean[n];

        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        vis[source]=true;

        while(!q.isEmpty()){
            int node=q.poll();
            if(node==destination) return true;

            for(int adjNode : adj.get(node)){
                if(!vis[adjNode]){
                    q.offer(adjNode);
                    vis[adjNode]=true;
                }
            }
        }
        return false;
    }
}
