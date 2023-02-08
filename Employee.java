package classeassignment;

public class Employee {
    
    //fields
    String name;
    int idNumber;
    String department;
    String position;
    
    //constructors
    public Employee(String n, int id, String d, String p) {
        name = n;
        idNumber = id;
        department = d;
        position = p;
    }
    
    public Employee (String n, int id) {
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }
    
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    
    public void setName(String n) {
        name = n;
    } 
    
    public void setIdNumber(int id) {
        idNumber = id;
    }
    
    public void setDepatrment(String d) {
        department = d;
    }
    
    public void setPosition(String p) {
        position = p;
    }
    
    public String getName() {
        return name;
    }
    
    public int getIdNumber() {
        return idNumber;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String getPosition() {
        return position;
    }
}
