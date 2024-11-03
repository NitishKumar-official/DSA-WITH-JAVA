
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class A05_TopologicalSorting {

    static class Edge{
        int src;
        int dst; 

        public Edge(int src, int dst){
            this.src = src;
            this.dst = dst;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));


    }



    public static void topSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s);
            }
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop()+ " ");
            
        }
    }


    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dst]){
                topSortUtil(graph, e.dst, vis, s);
            }
        }

        s.push(curr);
    }


    public static void main(String[] args){

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    }
    
}
