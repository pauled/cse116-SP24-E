package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public void addNode(N a){
        if (!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a,new ArrayList<>());
        }
    }

    @Override
    public String toString() {
        return this.adjacencyList.toString();
    }

    public boolean validPath(ArrayList<N> path){
        for (int i=0;i<path.size()-1; i++){
            N from=path.get(i);
            N to=path.get(i+1);
            if (!this.areConnected(from,to)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Graph<String> map=new Graph<>();
        map.addEdge("Buffalo","Toronto");
        map.addEdge("Toronto","Buffalo");
        map.addEdge("Toronto","Paris");
        map.addEdge("Paris","Lisbon");
        map.addEdge("Paris","Toronto");
        map.addEdge("Buffalo","Lisbon");
        map.addEdge("Buffalo","Buffalo");
        map.addEdge("Lisbon","Toronto");
        System.out.println(map);

        ArrayList<String> path=
                new ArrayList<>(Arrays.asList("Buffalo",
                "Toronto","Paris","Lisbon"));
        System.out.println(map.validPath(path));
    }
}
