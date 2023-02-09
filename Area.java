package classeassignment;

public class Area {
    
    double rectangle;
    
    public static double calculateCircules(double rad){
        return Math.PI * Math.pow(rad, rad);
    }
    
    public double calculateRectangles(double w, double l){
        rectangle = w * l;
        return rectangle;
    }
    
    public static double calculateCylinder(double rad, double height){
        return Math.PI * Math.pow(rad, rad) * height;
    }
    
    public String toString(){
        String str = String.format("%.2f", rectangle);
        return str;
    }
}
