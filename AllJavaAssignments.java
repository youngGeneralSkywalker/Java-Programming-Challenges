package alljavaassignments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class AllJavaAssignments {

    public static void main(String[] args) throws IOException
    {
        
        //common variables
        int choice;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("      All Java assignments");
        System.out.println("   --------------------------");
        System.out.println("""
                           ONLY ASSIGNMENTS FROM CH2 TO CH5
                           1- Cookie Calories
                           2- Circuit Board Profit
                           3- Resturant Bill
                           4- Roman Numerals
                           5- Body Mass Index
                           6- Test Scores and Grade
                           7- Sum of Numbers
                           8- Distance Traveled
                           9- Hotel Occupancy
                           10- Test Average and Grade
                           11- Conversion Program
                           12- isPrime
                           13- isEven
                           """);
        
        System.out.print("enter the desired assignment: ");
        choice = keyboard.nextInt();
        while (choice > 13 || choice < 1){//input validation
            System.out.print("wrong value,");
            System.out.print("enter the desired assignment: ");
            choice = keyboard.nextInt();
        }
        System.out.println("--------------------------");
        
        switch (choice) {
                
            //chapter 2
            case 1 -> {// 8.cookie calorie
                int cookie;
                int calorie;
        
                System.out.println("this program calculates the total calories consumed");
                System.out.print("enter the number of cookies you ate: ");
                cookie = keyboard.nextInt();
                calorie = cookie * 30;
                System.out.printf("your total calories consumed is %d\n", calorie);
            }
                    
            case 2 -> {// 11.circuit board profit
                double price;
                double profit;
                    
                System.out.println("""
                                    this program calculates the amount
                                    of profit earned for your product""");
                System.out.print("enter the retail price: ");
                price = keyboard.nextDouble();
                profit = price * 0.4;
                System.out.printf("the amount of profit you earned is %.2f\n",profit);
            }
                    
            case 3 -> {// 13.resturant bill
                double charge;
                double tax;
                double tip;
                double bill;
                   
                System.out.print("enter the meal charge: ");
                charge = keyboard.nextDouble();
                tax = (charge * 6.75) / 100;
                tip = (charge * 20) / 100;
                bill = charge + tax + tip;
                System.out.printf("""
                                      
                                  The meal charge = %.2f
                                  Tax = %.2f
                                  Tip amount = %.2f
                                  Total bill = %.2f
                                      """,
                            charge, tax, tip, bill);
            }
            
            //chapter 3    
            case 4 -> {// 1.roman numerals
                int num;
                   
                System.out.println("this program display the Roman\nnumeral version of a number you enter from 1-10");
                System.out.print("enter a number: ");
                num = keyboard.nextInt();
                
                while (num > 10 || num < 1){//input validation
                    System.out.print("invalid number, try again using numbers from 1-10 only");
                    num = keyboard.nextInt();
                }
                    
                    switch (num) {
                        case 1 -> System.out.println("the roman number of 1 is I");
                            
                        case 2 -> System.out.println("the roman number of 2 is II");
                            
                        case 3 -> System.out.println("the roman number of 3 is III");
                            
                        case 4 -> System.out.println("the roman number of 4 is IV");
                            
                        case 5 -> System.out.println("the roman number of 5 is V");
                            
                        case 6 -> System.out.println("the roman number of 6 is VI");
                            
                        case 7 -> System.out.println("the roman number of 7 is VII");
                            
                        case 8 -> System.out.println("the roman number of 8 is VIII");
                            
                        case 9 -> System.out.println("the roman number of 9 is IX");
                            
                        case 10 -> System.out.println("the roman number of 10 is X");
                    }
            }            
                
            case 5 -> {// 3.body mass index
                double BMI;
                double weight;
                double height;
        
                System.out.println("this program calculates your BMI");
                System.out.print("enter your weight in killograms: ");
                weight = keyboard.nextDouble();
                System.out.print("enter your height in meters: ");
                height = keyboard.nextDouble();
                BMI = weight / (height * height);
        
                if (BMI < 18.5)
                    System.out.printf("your BMI is %.2f, you are considered underweight\n", BMI);
                    else if (BMI < 25)
                        System.out.printf("your BMI is %.2f, you are considered optimal\n", BMI);
                    else 
                        System.out.printf("your BMI is %.2f, you are considered overweight\n", BMI);
            }
                
            case 6 -> {// 4.test scores and grade
                double score1;
                double score2;
                double score3;
                double average;
        
                System.out.println("This program display the "
                            + "average of the test scores and the letter grade");
                System.out.print("Enter your 1st test score: ");
                score1 = keyboard.nextDouble();
                System.out.print("Enter your 2nd test score: ");
                score2 = keyboard.nextDouble();
                System.out.print("Enter your 3rd test score: ");
                score3 = keyboard.nextDouble();
                average = (score1 + score2 + score3) / 3;
        
                if (average < 60)
                    System.out.printf("Your average score is %.2f, you have got a F\n", average);
                else if (average < 70)
                    System.out.printf("Your average score is %.2f, you have got a D\n", average);
                else if (average < 80)
                    System.out.printf("Your average score is %.2f, you have got a C\n", average);
                else if (average < 90)
                    System.out.printf("Your average score is %.2f, you have got a B\n", average);
                else if (average > 90 || average < 100)
                    System.out.printf("Your average score is %.2f, you have got an A\n", average);
                else 
                    System.out.printf("invalid scores, try again");
            }
            
            //chapter 4    
            case 7 -> {// 1.sum of numbers
                int number;
                int sumNumbers = 0;
                System.out.println("""
                                    this program takes a positive nonzero integer value,
                                    and print all the integers from (1 - number entered)""");
                System.out.print("enter a number: ");
                number = keyboard.nextInt();
                    
                while (number <= 0){//input validation
                    System.out.print("wrong value, enter again: ");
                    number = keyboard.nextInt();
                }
                    
                for (int i = 2 ; i <= number ; i++){
                    sumNumbers = number + sumNumbers;
                    System.out.printf("%d, ", (i-1));
                    if (i == number)
                        System.out.printf("%d\n", i);
                }
                System.out.printf("sum of numbers: %d\n", sumNumbers);
            }
            
            case 8 -> {// 3.distance file
                int speed, time, distance;
                System.out.println("""
                                    this program displays the distance a vehicle has traveled
                                    for each hour of a time period""");
                System.out.print("enter the speed: ");
                speed = keyboard.nextInt();
                System.out.print("enter the period of time: ");
                time = keyboard.nextInt();
                    
                //print report in file
                PrintWriter reportFile = new PrintWriter ("DistanceFile.txt");
                reportFile.println("HOUR\tDISTANCE TRAVELED");
                reportFile.println("-------------------------");

                for (int i = 1 ; i <= time ; i++){
                    distance = speed * i; 
                    reportFile.printf("%2d%15d\n", i, distance);
                    }
                reportFile.close();
                    
                //read and print report on output console
                File myFile = new File ("DistanceFile.txt");
                Scanner scanFile = new Scanner (myFile);
                while (scanFile.hasNext()){
                    String outputFile = scanFile.nextLine();
                    System.out.println (outputFile);
                }
                scanFile.close();
            }
                
            case 9 -> {// 7.hotel occupancy
                double floor, room, occupiedRooms ,vacantRooms, occupancyRate;
                double totalRoom = 0;
                double totalOccupiedRooms = 0;
                    
                System.out.println("Hotel Occupancy");
                System.out.println("this program calculates the occupancy rate for each floor of your hotel");
                System.out.print("\nHow many floors are in the hotel? ");
                floor = keyboard.nextDouble();
                while (floor < 1){ //input validation
                    System.out.println("invalid value, floors must not be less than 1 floor");
                    System.out.print ("please rewrite number of floors ");
                    floor = keyboard.nextDouble();
                    }
                for (int i = 1 ; i <= floor ; i++ ){
                    System.out.printf("\nHow many rooms are in floor %d? ", i);
                    room = keyboard.nextDouble();
                        
                    while (room < 10){//input validation
                        System.out.println("invalid value, rooms must not be less than 10 rooms");
                        System.out.print("please rewrite number of rooms ");
                        room = keyboard.nextDouble();
                    }
                        
                    totalRoom = room + totalRoom;
                    System.out.print("How many of these rooms are occupied? ");
                    occupiedRooms = keyboard.nextDouble();
                    totalOccupiedRooms = occupiedRooms + totalOccupiedRooms;
                }//for floor
                
                vacantRooms = totalRoom - totalOccupiedRooms;
                occupancyRate = (totalOccupiedRooms / totalRoom) * 100;
                System.out.printf("\nTotal room count: %.0f", totalRoom);
                System.out.printf("\nTotal occupied rooms count: %.0f", totalOccupiedRooms);
                System.out.printf("\nTotal vacant rooms count: %.0f", vacantRooms);
                System.out.printf("\nOccupancy rate: %.2f%%\n", occupancyRate);
            }
            
            //chapter 5
            case 10 -> {// 7.test average and grade
                double average;
                average = calcAverage();
                determineGrade (average);
            }
                
            case 11 -> {// 8.conversion program
                double meter;
                    
                System.out.println("This program will convert meter to your selection");
                System.out.print("enter distance in meter: ");
                meter = keyboard.nextDouble();
                    
                System.out.println("""
                                               1. Convert to kilometers
                                               2. Convert to inches
                                               3. Convert to feet
                                               4. Quit the program""");
                System.out.print("\nenter your choice: ");
                choice = keyboard.nextInt();
                while (choice != 4){
                        
                    switch (choice) {
                        case 1 -> showKilometer(meter);
                            
                        case 2 -> showInches(meter);
                            
                        case 3 -> showFeet(meter);
                    }
                        
                    System.out.println("""
                                                       \n1. Convert to kilometers
                                                       2. Convert to inches
                                                       3. Convert to feet
                                                       4. Quit the program""");
                    System.out.print("\nenter your choice: ");
                    choice = keyboard.nextInt();
                    }
                    System.out.println("bye!");
            }
                
            case 12 -> {// 13.isPrime method
                boolean flag;
                int number;
                   
                System.out.print("eneter a number to determine if prime or not: ");
                number = keyboard.nextInt(); 
                flag = isPrime (number);
                    
                if (flag)
                    System.out.printf("number %d is non prime\n", number);
                else
                    System.out.printf("number %d is prime\n", number);
            }
                
            case 13 -> {// 15.even/odd counter
                boolean flag;
                int number;
                int evenCounter = 0;
                int oddCounter = 0;
                Random rand = new Random();
                    
                for (int i = 0 ; i < 100 ; i++){
                    number = rand.nextInt(100);
                    flag = isEven(number);
                        
                    if (flag)
                        evenCounter++;
                    else
                        oddCounter++;
                }
                System.out.printf("%d numbers are even\n", evenCounter);
                System.out.printf("%d numbers are odd\n", oddCounter);
            }

                
            }//switch 
        
    }//main
    
    //chapter 5
    //methods for case 10: Test Average and Grade 
    public static double calcAverage (){
        double testScore, average = 0;
        
        System.out.println("Enter your scores to calculate the average");
        Scanner keyboard = new Scanner (System.in);
        for (int i = 0 ; i < 5 ; i++) {
            System.out.printf("enter test %d score: ", (i+1));
            testScore = keyboard.nextDouble();
            average += testScore;
        }
        return average/5;
    }
    
    public static void determineGrade (double average) {
        if (average < 60)
                        System.out.printf("Your average score is %.2f, you have got a F\n", average);
                    else if (average < 70)
                        System.out.printf("Your average score is %.2f, you have got a D\n", average);
                    else if (average < 80)
                        System.out.printf("Your average score is %.2f, you have got a C\n", average);
                    else if (average < 90)
                        System.out.printf("Your average score is %.2f, you have got a B\n", average);
                    else if (average > 90 || average < 100)
                        System.out.printf("Your average score is %.2f, you have got an A\n", average);
                    else 
                        System.out.printf("invalid scores, try again");
    }
    
    //methods for case 11: Conversion Program
    public static void showKilometer(double n){
        
        double kilo = n * 0.001;
        System.out.printf("%.2f meters is %.2f kilometer\n", n, kilo);
    }
    
    public static void showInches(double n){
        
        double inches = n * 39.37;
        System.out.printf("%.2f meters is %.2f inches\n", n, inches);
    }
    
    public static void showFeet(double n){
        
        double feet = n * 3.281;
        System.out.printf("%.2f meters is %.2f feet\n", n, feet);
    }
    
    //method for case 12: isPrime
    public static boolean isPrime (int num){
        
       boolean flag = false;
        
        if (num == 0 || num == 1)
            flag = false;
        
        for (int i = 2 ; i <= num/2 ; i++){
            if (num % i == 0)
                flag = true;
        }
        
        return flag;
    }
    
    //method for case 13: Even/Odd Counter
    public static boolean isEven (int num){
        return ((num % 2) == 0);
    }
    
    
}//class
