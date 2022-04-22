package Graph;

import java.util.*;

public class Graph_using_LL{
    Map<Integer, LinkedList<Integer>> obj;
    Graph_using_LL(){
        obj = new HashMap<>();
    }

    public void addedge(int v1 , int v2 , boolean bidirectional){
        LinkedList<Integer> v1_neighbour = obj.getOrDefault(v1 , new LinkedList<>());
        v1_neighbour.add(v2);
        obj.put(v1,v1_neighbour);
        if(bidirectional == true){
            LinkedList<Integer> v2neighbour = obj.getOrDefault(v2, new LinkedList<>());
            v2neighbour.add(v1);
            obj.put(v2 , v2neighbour);
        }
    }

    public void bfsTraversal(int source){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        Set<Integer> visited = new HashSet<>();
        visited.add(source);
        while(!queue.isEmpty()){
            int front = queue.poll();
            System.out.print(front + " ");
            List<Integer> neighbours = obj.get(front);
            for(int i : neighbours){
                if(!visited.contains(i)){
                    queue.add(i);
                    visited.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph_using_LL graph = new Graph_using_LL();
        graph.addedge(2,5,true);
        graph.addedge(3,4,true);
        graph.addedge(2,3,false);

        for(Map.Entry<Integer,LinkedList<Integer>> res : graph.obj.entrySet()){
            System.out.print(res.getKey()+": ");
            System.out.println(res.getValue());
        }
        System.out.println("Various roots BFS Traversals are:-");
        graph.bfsTraversal(2);
        System.out.println();
        graph.bfsTraversal(4);
    }
}