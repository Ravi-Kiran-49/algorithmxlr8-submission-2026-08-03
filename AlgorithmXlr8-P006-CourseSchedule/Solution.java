import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your solution here.
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        int[][] pairs=new int[m][2];
        for(int i=0;i<m;i++){
            pairs[i][0]=scanner.nextInt();
            pairs[i][1]=scanner.nextInt();
        }

        scanner.close();

        System.out.println(isPossible(n, m, pairs));
    }
    public static boolean isPossible(int n, int m, int[][] pairs){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] inDegree=new int[n];

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int a=pairs[i][0];
            int b=pairs[i][1];
            adj.get(b).add(a);
            inDegree[a]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0) q.offer(i);
        }
        

        while(!q.isEmpty()){
            int node=q.poll();

            for(int adjNode : adj.get(node)){
                inDegree[adjNode]--;
                if(inDegree[adjNode]==0) q.offer(adjNode);
            }
        }
        
        for(int i=0;i<n;i++){
            if(inDegree[i]!=0) return false;
        }
        return true;
    }
}
