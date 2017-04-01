/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.model;

import harrypotter.HarryPotter;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Cami
 */
public class HousePoints implements Serializable {
    
    //class instance variable 
    private String house;
    private double amount;
 
    public static int[] HousePoints = {HarryPotter.getPlayer().getHousePoints(), 100, 200, 300};
    
    public HousePoints(){
    }
    
    public HousePoints(String house, double amount){
        
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
