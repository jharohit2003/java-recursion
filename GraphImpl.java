package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphImpl {
    static void dfs(List<List<Integer>> graph,int node ,boolean [] visited){

        System.out.print(node +" ");
        visited[node]=true;
        for(int ele :graph.get(node)){
            if(!visited[ele]){
                dfs(graph, ele, visited);
            }
        }
    }
    static void bfs(List<List<Integer>> graph,int node ){
          boolean visited [] = new boolean[graph.size()];
          Queue<Integer> queue = new LinkedList<>();
          queue.add(node);
          visited[node]=true;
          while(!queue.isEmpty()){
            int cur = queue.poll();
            System.out.print(cur +" ");;
            for(int ele : graph.get(cur)){
                if(!visited[ele]){
                    queue.add(ele);
                    visited[ele]=true;
                }
            }
          }
    }
    public static void main(String[] args) {
        int V=4;
        List<List<Integer>> graph = new ArrayList<>();

      // adj
      for(int i =0 ;i<V ;i++){
        graph.add(new ArrayList<>());
      }
      graph.get(0).add(1);
      graph.get(0).add(3);
      graph.get(1).add(0);
      graph.get(1).add(2);
      graph.get(2).add(1);
      graph.get(2).add(3);
      graph.get(3).add(1);
      graph.get(3).add(2);
      System.out.println(graph);

      boolean visited [] = new boolean[V];
      dfs(graph, 0, visited);
      System.out.println();
      bfs(graph, 0);

    }
}
