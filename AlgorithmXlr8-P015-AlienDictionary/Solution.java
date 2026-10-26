/*
topological sort, dependency graph problem
find relation between words(dependencies)
build inDegree, adjList and solve
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your solution here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];

        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        sc.close();

        System.out.println(helper(n, words));
    }
    public static String helper(int n, String[] words){
        int[] inDegree=new int[26];
        HashSet<Integer> set=new HashSet<>();
        List<List<Integer>> adj=new ArrayList<>();

        for(String word : words){
            for(char ch : word.toCharArray()){
                set.add(ch-'a');
            }
        }

        for(int i=0;i<26;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++){
            String s1=words[i];
            String s2=words[i+1];

            if(s1.length()>s2.length() && s1.startsWith(s2)) return "";

            int len=Math.min(s1.length(), s2.length());
            for(int j=0;j<len;j++){
                char ch1=s1.charAt(j);
                char ch2=s2.charAt(j);
                if(ch1==ch2) continue;
                else{
                    inDegree[ch2-'a']++;
                    adj.get(ch1-'a').add(ch2-'a');
                    break;
                }
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<26;i++){
            if(inDegree[i]==0 && set.contains(i)){
                q.offer(i);
            } 
        }
        StringBuilder sb=new StringBuilder();

        while(!q.isEmpty()){
            int node=q.poll();
            sb.append((char)(node+'a'));

            for(int adjNode : adj.get(node)){
                inDegree[adjNode]--;
                if(inDegree[adjNode]==0) q.offer(adjNode);
            }
        }
        if(sb.length()!=set.size()) return "";
        return sb.toString();
    }
}
