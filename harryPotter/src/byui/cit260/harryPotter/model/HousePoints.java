/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Cami
 */
public class HousePoints implements Serializable {
    
    //class instance variable 
    private String house;
    private double amount;
    
    public HousePoints(){
    }
    
    public HousePoints(String house, double amount){
        
    }
    
    public void submitHousePoints(){
        int housePoints[] = {500, 600, 700, 800};
        
        System.out.println("\n\t HOUSE POINTS");
        System.out.println(" Hufflepuff has " + housePoints[0] + " house points!");
        System.out.println(" Ravenclaw has " + housePoints[1] + " house points!");
        System.out.println(" Slytherin has " + housePoints[2] + " house points!");
        System.out.println(" Gryffindor has " + housePoints[3] + " house points!");
        
        findMinMaxPoints(housePoints);
    }
    
    public void findMinMaxPoints(int housePoints[]){
        int min, max;
        
        min = max = housePoints[0];
        for(int i=1; i < 4; i++){ // i starts at 1 to compare next value. if statements replace min/max value
            if(housePoints[i] < min) min = housePoints[i];
            if(housePoints[i] > max) max = housePoints[i];
        }
        
        System.out.println("\n Minimum and Maximum House Points: " + min + " and " + max);
    }
    
    
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.house);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "HousePoints{" + "house=" + house + ", amount=" + amount + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HousePoints other = (HousePoints) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.house, other.house)) {
            return false;
        }
        return true;
    }
    
    
     
    
}
