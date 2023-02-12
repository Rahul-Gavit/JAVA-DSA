package Graph.Code;

import java.util.ArrayList;

public class CycleDetection {

    static class Edge{

        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    // Undirected Graph
    static void createGraph(ArrayList<Edge> []graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 3));

    }

    //O(V+E)
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean [graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1));
                return true;
                // Cycle exist in one of the part
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case3
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            //case1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            //case2 -> do nothing -> continue
        }
        return false;
    }

    //Directed Graph
    static void createGraph1(ArrayList<Edge> []graph){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));

    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ //Cycle
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }

        stack[curr] = false;
        return false;

    }
    public static void main(String[] args) {
            /*
               0------3
              /|      |
             / |      |
            1  |      |
            \  |      4
             \ |
               2
             */

             /*
                1 ----> 0<
                        | \
                        |  \ 
                        |   >3
                        |  /
                        > /
                        2
              */

             int V = 5;
             ArrayList<Edge>[] graph = new ArrayList[V];
             createGraph(graph);
             createGraph1(graph);

             System.out.println(detectCycle(graph));
             System.out.println(isCycle(graph));
    }
}