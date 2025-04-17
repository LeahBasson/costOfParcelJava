
package calculatecostofparcel;

import java.util.Scanner;


public class CalculateCostOfParcel {

    
    public static void main(String[] args) {
        //Reads in the weight of the parcel 
        //Displays the amount that it will cost to send that parcel.
        
        Scanner scn = new Scanner(System.in);
        
        double weight;
        System.out.println("Enter the weight: ");
        weight = scn.nextDouble();
        
        if(weight <= 0 )
            System.out.println("Invalid weight entered.");
        else{
            if (weight < 2){
                System.out.println("It will cost R10.00 to deliver your parcel.");
            }
            else if(weight >= 2 && weight < 4 ){
                System.out.println("It will cost R20.00 to deliver your parcel.");
            }
            else if(weight >= 4 && weight < 6){
                System.out.println("It will cost R30.00 to deliver your parcel.");
            }
            else if(weight >= 6){
                System.out.println("It will cost R50.00 to deliver your parcel.");
            }
        }
    }
    
}
