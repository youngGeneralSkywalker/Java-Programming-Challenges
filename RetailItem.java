package classeassignment;

public class RetailItem {
    String description;
    int unitsOnHand;
    double price;

    
    public RetailItem(String des, int units, double cost){
        description = des;
        unitsOnHand = units;
        price = cost;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString(){
        String str = String.format("\t  %s%15d%14.2f", description, unitsOnHand, price);
        return str;
    }
}
