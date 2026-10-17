import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your solution here.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] pairs=new int[m][2];

        for(int i=0;i<m;i++){
            pairs[i][0]=sc.nextInt();
            pairs[i][1]=sc.nextInt();
        }
        sc.close();

        ArrayList<Integer> res=helper(n, m, pairs);

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
            if(i!=res.size()-1) System.out.print(" ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> helper(int n, int m, int[][] pairs){
        int[] inDegree=new int[n];
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
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
            res.add(node);

            for(int adjNode : adj.get(node)){
                inDegree[adjNode]--;
                if(inDegree[adjNode]==0) q.offer(adjNode);
            }
        }
        if(res.size()==n) return res;
        ArrayList<Integer> temp=new ArrayList<>();
        return temp;
    }
}
