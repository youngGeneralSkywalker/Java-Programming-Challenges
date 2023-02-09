package classeassignment;

public class RoomCarpet {
    Area size = new Area();
    double cost = 8;
    
    public double totalCost(){
        double carpet = size.calculateRectangles(12, 10);
        cost = carpet * cost;
        return cost;
    }
    
    public String toString(){
        String str = String.format("%f", cost);
        return str;
    }
}
