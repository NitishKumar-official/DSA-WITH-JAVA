
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class A01_HasPath {

    static class Edge{
        int src;
        int dst; 
        int wt;

        public Edge(int src, int dst, int wt){
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }

    public static boolean has_path(ArrayList<Edge>[] graph, int src, int dst, boolean vis[]){
        if(src==dst){
            return true;
        }
        vis[src] = true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dst] && has_path(graph, e.dst, dst, vis) ){
                return true;
            }
        }

        return false;
    }



    public static void main(String[] args){

        /*
         
            1------3
           /        |  \
          0         |   5-------6
           \        | /
            2 ------4


         */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(has_path(graph, 0, 5, new boolean[V]));


    }
    
}
