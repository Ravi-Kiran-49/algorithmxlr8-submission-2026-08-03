import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        long[] calories = new long[n];
        for (int i = 0; i < n; i++) calories[i] = sc.nextLong();

        int val=0;
        int totalPoints=0;
        for(int i=0;i<k;i++){
            val+=calories[i];
        }

        if(val<lower) totalPoints--;
        else if(val>upper) totalPoints++;


        for(int i=k;i<n;i++){
            val-=calories[i-k];
            val+=calories[i];

            if(val<lower) totalPoints--;
            else if(val>upper) totalPoints++;
        }

        System.out.println(totalPoints);


        // Write your solution here.
        // Print the total points scored across every consecutive k-day window,
        // losing a point if a window's sum is below lower, gaining one if above
        // upper.
    }
}
