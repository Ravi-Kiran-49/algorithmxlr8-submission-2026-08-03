import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        // Write your solution here.
        // Print "true" if every possible binary code of length k appears as
        // a substring of s, otherwise print "false".
        int n=s.length();
        HashSet<String> set=new HashSet<>();
        
        for(int i=0;i<=n-k;i++){
            set.add(s.substring(i, i+k));
        }
        System.out.println(set.size()==Math.pow(2,k));
    }
}
