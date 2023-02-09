package classeassignment;

public class CashRegister {
    
    RetailItem item;
    int quantity;
    double subtotal;
    double tax;
    
    public CashRegister(RetailItem item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }
    
    public double getSubtotal(){  
        subtotal = item.getPrice() * quantity;
        
        return subtotal;
    }
    
    public double getTax(){
        tax = item.getPrice() * 0.06 ;
        return tax;
    }
    
    public double getTotal(){
        return subtotal + tax;
    }
    
    public String toString(){
        String str = "Subtotal: " + subtotal + "\nTax: "
                + tax + "\nTotal: " + getTotal();
        return str;
    }
}
