package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<Edge<N>>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(Edge<N> edge){
        N from=edge.getStart();
        N to=edge.getEnd();
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(edge);
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
    public boolean areConnected(N from,N to){
        if (this.adjacencyList.containsKey(from)){
            for (Edge edge : this.adjacencyList.get(from)){
                if (edge.getEnd().equals(to)){
                    return true;
                }
            }
        }
        return false;
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
        ArrayList<Edge<String>> flights=new ArrayList<>();
        flights.add(new Flight<>("BUF","YYZ",199.35,90,1));
        flights.add(new Flight<>("YYZ","BUF",354.35,200,1));
        flights.add(new Flight<>("BUF","WDC",299.35,320,3));
        flights.add(new Flight<>("JFK","BUF",499.35,160,3));
        flights.add(new Flight<>("WDC","JFK",275.35,500,7));
        flights.add(new Flight<>("WDC","BUF",349.35,390,1.2));
        for (Edge<String> flight : flights){
            map.addEdge(flight);
        }

        System.out.println(map);

        ArrayList<String> path=
                new ArrayList<>(Arrays.asList("BUF",
                "WDC","JFK"));
        System.out.println(map.validPath(path));
    }
}
