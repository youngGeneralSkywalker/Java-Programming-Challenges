package classeassignment;

public class Rainfall {
    double total = 0;
    int maximam = 0;
    int minimum = 0;
    
    public Rainfall(){
    }
    
    
    public double totalRainfall(double[] a) {
        for (int i = 0 ; i < a.length ; i++)
            total += a[i];
        return total;
    }
    
    public double averageRainfall (double[] a, double t) {
        return t/a.length;
    }
    
    public int mostRainfall(double[] a) {
        for (int i = 0 ; i < a.length ; i++){
            int max = (int) a[i];
            if (max > a[maximam])
                maximam = i;
        }
        
        return (maximam + 1);
    }
    
   
    public int leastRainfall(double[] a) {
        for (int i = 0 ; i < a.length ; i++){
            int min = (int) a[i]; 
            if (min < a[minimum])
                minimum = i;
        }
        
        return (minimum + 1);
    }
}