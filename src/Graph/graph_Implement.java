package Graph;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class graph_Implement {

    Map<Integer, LinkedList<Integer>> obj;
    graph_Implement(){
        obj = new HashMap<>();
    }
    public void addEdge(int v1 , int v2 , boolean bidirectional){
        LinkedList<Integer> v1Neighbour = obj.getOrDefault(v1,new LinkedList<>());
        v1Neighbour.add(v2);
        obj.put(v1, v1Neighbour);
        if(bidirectional){
            LinkedList<Integer> v2Neighbour = obj.getOrDefault(v2, new LinkedList<>());
            v2Neighbour.add(v1);
            obj.put(v2,v2Neighbour);
        }
    }

    public void bfs(int source){
        Queue<Integer> qu = new LinkedList<>();
        qu.add(source);
        Set<Integer> vis = new HashSet<>();
        vis.add(source);
        while(!qu.isEmpty()){
            int front = qu.poll();
            System.out.print(front +" ");
            LinkedList<Integer> neighbrs = obj.get(front);
            for(Integer i : neighbrs) {
                if(!vis.contains(i)) {
                    qu.add(i);
                    vis.add(i);
                }
            }
        }
    }

    public void dfs(int source){
        Set<Integer> visited = new HashSet<>();
        dfshelper(source , visited);
    }
    private void dfshelper(int source , Set<Integer> visited){
        System.out.print(source+" ");
        visited.add(source);
        LinkedList<Integer> neighbour = obj.get(source);
        for(Integer i : neighbour){
            if(!visited.contains(i)){
                visited.add(i);
                dfshelper(i,visited);
            }
        }
    }

    public static void main(String[] args) {
        graph_Implement gp = new graph_Implement();
        gp.addEdge(10,20,true);
        gp.addEdge(20,30,true);
        gp.addEdge(10,30,true);
        gp.addEdge(30,40,true);
        System.out.println("Dfs traversal :- ");
        gp.dfs(20);
        System.out.println();
        gp.dfs(10);
    }
}
