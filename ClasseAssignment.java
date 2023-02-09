package classeassignment;

import java.util.Scanner;

public class ClasseAssignment {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        /*
        //Chapter 6
        // 1.employee class
        Employee worker1 = new Employee("Joy rogers", 81774, "Manufacturing", "Engineer");
        
        Employee worker2 = new Employee("Mark Jones", 39119);
        worker2.setDepatrment("IT");
        worker2.setPosition("Programmer");
        
        Employee worker3 = new Employee();
        worker3.setName("Susan Meyers");
        worker3.setIdNumber(47899);
        worker3.setDepatrment("Accounting");
        worker3.setPosition("Vice President");
        
        System.out.println("Name\t\tID Number\tDepartment\tPosition");
        System.out.println("-------------------------------------------------------------");
        
        System.out.print (worker1.getName());
        System.out.print("\t");
        System.out.print (worker1.getIdNumber());
        System.out.print("\t\t");
        System.out.print (worker1.getDepartment());
        System.out.print("\t");
        System.out.print (worker1.getPosition());
        System.out.println("");
        
        System.out.print (worker2.getName());
        System.out.print("\t");
        System.out.print (worker2.getIdNumber());
        System.out.print("\t\t");
        System.out.print (worker2.getDepartment());
        System.out.print("\t\t");
        System.out.print (worker2.getPosition());
        System.out.println("");
        
        System.out.print (worker3.getName());
        System.out.print("\t");
        System.out.print (worker3.getIdNumber());
        System.out.print("\t\t");
        System.out.print (worker3.getDepartment());
        System.out.print("\t");
        System.out.print (worker3.getPosition());
        System.out.println("");
        
        
        // 2.car class
        Car toyota = new Car(2014, "Japan");
        int velocity;
        
        System.out.print("enter velocity: ");
        velocity = keyboard.nextInt();
        toyota.setSpeed(velocity);
        
        System.out.println("now we +accelerate velocity for 5 times");
        for (int i = 0 ; i < 5 ; i++){
            velocity = toyota.accelerate();
            System.out.printf("%d ", velocity);
        }
        
        System.out.println("\nnow we -accelerate velocity for 5 times");
        for (int i = 0 ; i < 5 ; i++){
            velocity = toyota.brake();
            System.out.printf("%d ", velocity);
        }
       
        
        // 3.personal info class
        PersonalInfo rawan = new PersonalInfo();
        
        rawan.setName("Rawan mother of cats");
        rawan.setAddress(6423);
        rawan.setAge(18);
        rawan.setPhoneNumber(0500);
        
        System.out.println(rawan.getName());
        System.out.println(rawan.getAddress());
        System.out.println(rawan.getAge());
        System.out.println(rawan.getPhoneNumber());
*/
        
        // 4.retailItem class
        System.out.println("\tDescription\tUnits on hand\t Price");
        System.out.println("----------------------------------------------");
        
        System.out.print("Item #1");
        RetailItem item1 = new RetailItem("rings", 12, 59.95);
        System.out.println(item1);
        
        System.out.print("Item #2");
        RetailItem item2 = new RetailItem("jeans", 40, 34.95);
        System.out.println(item2);
        
        System.out.print("Item #3");
        RetailItem item3 = new RetailItem("shirt", 20, 24.95);
        System.out.println(item3);
        
       /* 
        //Chapter 7
        // 1.Rainfall class
        Rainfall rainRate = new Rainfall();
        double[] rainFall = new double[4];
        double rain, total, average;
        int most, least;
        int index = 0;
        
        while (index < rainFall.length ) {
            System.out.printf("enter rainfall for month %d: ", (index + 1));
            rain = keyboard.nextDouble();
            while (rain < -1){
                System.out.print("wrong value, please re enter: ");
                rain = keyboard.nextDouble();
            } 
            rainFall[index] = rain;
            index++;
        }
        
        total = rainRate.totalRainfall(rainFall);
        System.out.println("total rain fall: " + total);
        
        average = rainRate.averageRainfall(rainFall, total);
        System.out.println("average monthly rainfall: " + average);
        
        most = rainRate.mostRainfall(rainFall);
        System.out.printf("the month with the most rain is month number %d", most);
        System.out.println("");
        
        least = rainRate.leastRainfall(rainFall);
        System.out.printf("the month with the least rain is month number %d", least);
        System.out.println("");
         
        
        // 2.Payroll class
        Payroll payment = new Payroll();
        int hours;
        double rate;
        int id;
        
        for (int i = 0 ; i < payment.getEmployeeId().length ; i++ ){
            System.out.print("enter employee " + payment.getEmployeeId(i) + " hours: ");
            hours = keyboard.nextInt();
            while (hours < 0){
                System.out.print("invalid hour, enter a positive value: ");
                hours = keyboard.nextInt();
            }
            payment.setHours(hours, i);
            
            System.out.print("enter employee " + payment.getEmployeeId(i) + " pay rate: ");
            rate = keyboard.nextDouble();
            while (rate < 6){
                System.out.print("invalid hour, enter a positive value: ");
                rate = keyboard.nextDouble();
            }
            payment.setPayRate(rate, i);   
        }
        
        for (int i = 0 ; i < payment.getEmployeeId().length ; i++ ){
            System.out.println("employee number " + payment.getEmployeeId(i)
                    + " have earned " + payment.calWages(i));
        }
        
        System.out.print("enter an employee id to search wage: ");
        id = keyboard.nextInt();
       
        System.out.println(id + "employee wage is " + payment.wageForEmployee(id));
        
        
        // 3.Charge Account Validation
        int accNum;
        ChargeAcc account = new ChargeAcc(); 
        System.out.print("enter your charge acc number: ");
        accNum = keyboard.nextInt();
 
        if (account.isValid(accNum))//array
            System.out.println("number is valid");
        else 
            System.out.println("number is invalid");
        
        if (account.isItValid(accNum))//arrayList
            System.out.println("number is valid");
        else 
            System.out.println("number is invalid");
        
        
        // 6.Driver licence exam
        DriverExam std = new DriverExam();
        
        if (std.passed())
            System.out.println("passed");
        else 
            System.out.println("failed");
        
        System.out.println("total correct answers: " + std.correct);
        System.out.println("total incorrect answers: " + std.incorrect);
        //System.out.println("total missed answers: " + );
        
        int[] missedQuestions = new int[std.questionlMissed.length];
        missedQuestions = std.questionlMissed();
        for (int i = 0 ; i < std.questionlMissed().length ; i++){
            System.out.println(missedQuestions[i]);
        }
        
        
        //Chapter 8
        // 1.area
        Area shapes = new Area();        
        System.out.printf("%.2f\n", shapes.calculateCircules(2));
        System.out.printf("%.2f\n", shapes.calculateRectangles(2, 2));
        System.out.printf("%.2f\n", shapes.calculateCylinder(2, 2));
        
        
        // 3.carpet calculator
        RoomCarpet carpet = new RoomCarpet();
        System.out.println(carpet.totalCost());
        
        
        // 6.cash register (must work with 4.retailItem)
        
        CashRegister cash1 = new CashRegister(item1, 1);
        cash1.getSubtotal();
        cash1.getTax();
        cash1.getTotal();
        
        CashRegister cash2 = new CashRegister(item2, 2);
        cash2.getSubtotal();
        cash2.getTax();
        cash2.getTotal();
        
        CashRegister cash3 = new CashRegister(item3, 23);
        cash3.getSubtotal();
        cash3.getTax();
        cash3.getTotal();
        
        System.out.println("\nBill of first item\t\tBill of second item\t\tBill of third item");
        
        System.out.println("Subtotal: " + cash1.getSubtotal() +
                           "\t\t\tSubtotal: " + cash2.getSubtotal() + 
                           "\t\t\tSubtotal: " + cash3.getSubtotal());
        
        System.out.println("Tax: " + cash1.getTax() +
                           "\t\t\tTax: " + cash2.getTax() + 
                           "\t\t\tTax: " + cash3.getTax());
        
        System.out.println("Total: " + cash1.getTotal() +
                           "\tTotal: " + cash2.getTotal() + 
                           "\t\t\tTotal: " + cash3.getTotal());
        */
        //Chapter 10
        //Assignment 1: employee and production worker
        
        
    }
    
}
