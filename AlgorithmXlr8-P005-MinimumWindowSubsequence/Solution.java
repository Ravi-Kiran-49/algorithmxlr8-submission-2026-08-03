import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        // Write your solution here.
        // Print the minimum-length contiguous substring of S that contains T
        // as a subsequence. If none exists, print "(none)".
        int n=s.length();
        int m=t.length();

        String minWindow="(none)";
        int minLength=n+1;
        int sInd=0;
        int tInd=0;

        while(sInd<n){
            if(s.charAt(sInd)==t.charAt(tInd)){
                tInd++;
                if(tInd==m){
                    int end=sInd;
                    tInd--;
                    while(tInd>=0){
                        if(s.charAt(sInd)==t.charAt(tInd)) tInd--;
                        if(tInd>=0) sInd--;
                    }
                    int curLength=end-sInd+1;
                    if(curLength<minLength){
                        minLength=curLength;
                        minWindow=s.substring(sInd, end+1);
                    }
                    tInd=0;
                }
            }
            sInd++;
        }
        
        System.out.println(minWindow);









    }
}
