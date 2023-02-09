package classeassignment;

import java.util.ArrayList;

public class ChargeAcc {
    boolean validation = true;
    int charge;
    int[] charges = {1, 2, 3, 4, 5};
    ArrayList<Integer> chargesInList = new ArrayList<Integer>();
    int index = 0;
  
    //used both in array and arrayList to show difference 
    public boolean isValid(int num) {
        charge = num;
        while (index < charges.length){
            if (charges[index] == charge){
                validation = false;
                break;
            }
            index++;
        }
        return validation;
    }
    
    public boolean isItValid(int num){
        chargesInList.add(1);
        chargesInList.add(2);
        chargesInList.add(3);
        chargesInList.add(4);
        charge = num;
        while (index < chargesInList.size()){
            if (chargesInList.get(index) == charge){
                validation = false;
                break;
            }
            index++;
        }
        return validation;
    }
    
}
