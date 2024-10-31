import java.util.*;

public class A02Sortest_path {

    public static void shortestPath(String direction){
        int x=0,y=0;
        char N,E,S,W;

        for(int i=0; i<direction.length();i++){
            char c = direction.charAt(i);
            if(c=='E'){
                x+=1;
            }
            if(c=='W'){
                x-=1;
            } 
            if(c=='N'){
                y+=1;
            }
             if(c=='S'){
                y-=1;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        float path =(float)Math.sqrt(X2+Y2);
        System.out.println(path);


    }
    public static void main(String[] args){
        System.out.println("enter Your Direction");
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();
        shortestPath(direction);


        
        
    }
    
}
