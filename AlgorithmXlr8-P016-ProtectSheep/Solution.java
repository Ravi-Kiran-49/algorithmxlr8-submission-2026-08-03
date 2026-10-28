import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), C = sc.nextInt();
        String[] grid = new String[R];
        for (int i = 0; i < R; i++) grid[i] = sc.next();

        // Write your solution here.
        boolean flag=true;
        StringBuilder[] res=new StringBuilder[R];
        int[] dirRow={-1,0,0,1};
        int[] dirCol={0,-1,1,0};

        for(int i=0;i<R;i++){
            res[i]=new StringBuilder();
            for(int j=0;j<C;j++){
                if(grid[i].charAt(j)=='S'){
                    res[i].append('S');
                }
                else if(grid[i].charAt(j)=='.'){
                    res[i].append('D');
                }
                else if(grid[i].charAt(j)=='W'){
                    res[i].append('W');
                    for(int k=0;k<4;k++){
                        int x=i+dirRow[k];
                        int y=j+dirCol[k];
                        if(x<R && x>=0 && y<C && y>=0 && grid[x].charAt(y)=='S'){
                            flag=false;
                        }
                    }
                }
            }
        }
        if(!flag) System.out.println("No");
        else{
            System.out.println("Yes");
            for(int i=0;i<R;i++){
                System.out.println(res[i].toString());
            }
        }
    }
}
