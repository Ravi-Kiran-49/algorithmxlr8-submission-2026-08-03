import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = sc.nextInt();

        // Write your solution here.
        // Print the minimum number of swaps needed to group all the 1s in
        // data together into one contiguous stretch.

        int cnt=0;
        
        for(int num : data){
            if(num==1) cnt++;
        }

        int sum=0;
        int maxOnes=0;
        for(int i=0;i<cnt;i++){
            sum+=data[i];
        }
        maxOnes=Math.max(maxOnes, sum);

        for(int i=cnt;i<n;i++){
            sum-=data[i-cnt];
            sum+=data[i];
            maxOnes=Math.max(maxOnes, sum);
        }
        System.out.println(cnt-maxOnes);











    }
}
