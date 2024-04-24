package week13;

public class FlightDistance implements Cost<Flight>{
    public double cost(Flight edge){
        return edge.getDistance();
    }
}
