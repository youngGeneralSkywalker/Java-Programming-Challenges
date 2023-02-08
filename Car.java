package classeassignment;

public class Car {
    
    int yearModel;
    String make;
    public int speed;
    
    //constructor + methods
    public Car(int year, String make) {
        yearModel = year;
        this.make = make;
        speed = 0;
    }
    
    public void setYearModel(int y) {
        yearModel = y;
    }
    
    public void setMake(String m) {
        make = m;
    }
    
    public void setSpeed (int s) {
        speed = s;
    }
    
    public int accelerate() {
        speed += 5;
        return speed;
    }
    
    public int brake() { 
        speed -=5;
        return speed;
    }
    
    
    
}
