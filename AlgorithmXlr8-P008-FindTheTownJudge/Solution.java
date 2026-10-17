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

        System.out.println(helper(n, m, pairs));
    }
    public static int helper(int n, int m, int[][] pairs){
        int[] trustTo=new int[n+1];
        int[] trustedBy=new int[n+1];

        for(int i=0;i<m;i++){
            int a=pairs[i][0];
            int b=pairs[i][1];
            trustTo[a]++;
            trustedBy[b]++;
        }

        for(int i=1;i<=n;i++){
            if(trustTo[i]==0 && trustedBy[i]==n-1) return i;
        }
        return -1;
    }
}
