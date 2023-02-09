package classeassignment;

public class Payroll {
    public int[] employeeId = {5658845, 4520125, 7895122};
    int numOfEmployee = employeeId.length;
    int[] hours = new int[numOfEmployee];
    double[] payRate = new double[numOfEmployee];
    double[] wages = new double[numOfEmployee];
   
    public int[] getEmployeeId() {
        return employeeId;
    }
    
    public int getEmployeeId (int index) {
        return employeeId[index];
    }
    
    public double calWages(int j) {
        for (int i = 0 ; i < numOfEmployee ; i++ )
            wages[i] = hours[i] * payRate[i];
        return wages[j];
    }
    
    public double wageForEmployee(int id) {
        for (int i = 0 ; i < numOfEmployee ; i++){
            if (employeeId[i] == id)
                return wages[i];
        }
        return -1;
    }
    
    public void setHours(int h, int index) {
        hours[index] = h;
    }
    
    public void setPayRate(double p, int index) {
        payRate[index] = p;
    }
    
}
