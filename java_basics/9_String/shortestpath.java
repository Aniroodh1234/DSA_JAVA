import java.util.*;
public class shortestpath{
    public static int direction(String dir){
        int x = 0;
        int y = 0;
        for(int i = 0; i<dir.length();i++){
            char ch = dir.charAt(i);
            if(ch=='E'){
                x++;
            }
            else if(ch=='W'){
                x--;
            }
            else if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
        }
        int distance = (x*x)+(y*y);
        int shortest_dist = (int)Math.sqrt(distance);
        return shortest_dist;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int dir = direction(str);
        System.out.print(dir);
    }
}