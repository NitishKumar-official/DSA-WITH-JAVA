import java.util.ArrayList;

public class A02_DetectCycle {

     static class  Edge {
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

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
     }

     public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, i, vis,-1)){
                    return true;
                }
            }
        }
        return false;
     }

     public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], int parent){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dst]){
                if(detectCycleUtil(graph, e.dst, vis, curr)){
                    return true;
                }
            }
            else if(vis[e.dst] && e.dst != parent){
                return true;
            }
        }
        return false;
     }


public static void main(String[] args){
    int V = 5;
    ArrayList<Edge>[] graph = new ArrayList[V];

    createGraph(graph);
    System.out.println(detectCycle(graph));
}     
}