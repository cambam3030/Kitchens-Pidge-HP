/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author chriskitchens
 */
public class Inventory implements Serializable{
    
    // class instance variables
    private double amountNeeded;
    private double stockAvailable;
    private String name;

    public Inventory() {
    }
    public Inventory(String name, double amountNeeded, double stockAvailable){
         createInventory();
         }
     public static Inventory[]  createInventory(){
             //create public static new list of inventory items
             
             Inventory[] inventory = new Inventory [15];
             inventory[0] = new Inventory("wand", 1, 0);
             inventory[1] = new Inventory("invisibility cloak", 1, 0);
             inventory[2] = new Inventory("time turner", 1, 0);
             inventory[3] = new Inventory("owl", 1, 0);
             inventory[4] = new Inventory("poly juice potion", 1, 0);
             inventory[5] = new Inventory("felix felicis", 1, 0);
             inventory[6] = new Inventory("mandrake root", 1, 0);
             inventory[7] = new Inventory("bezoar", 1, 0);
             inventory[8] = new Inventory("dittany", 1, 0);
             inventory[9] = new Inventory("dragons blood", 1, 0);
             inventory[10] = new Inventory("broomstick", 1, 0);
             inventory[11] = new Inventory("potions book", 1, 0);
             inventory[12] = new Inventory("cauldron", 1, 0);
             inventory[13] = new Inventory("library pass", 1, 0);
             inventory[14] = new Inventory("snitch", 1, 0);
             
             return inventory;                     
         }       
    
    public double getAmountNeeded() {
        return amountNeeded;
    }

    public void setAmountNeeded(double amountNeeded) {
        this.amountNeeded = amountNeeded;
    }

    public double getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(double stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.amountNeeded) ^ (Double.doubleToLongBits(this.amountNeeded) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.stockAvailable) ^ (Double.doubleToLongBits(this.stockAvailable) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.amountNeeded) != Double.doubleToLongBits(other.amountNeeded)) {
            return false;
        }
        if (Double.doubleToLongBits(this.stockAvailable) != Double.doubleToLongBits(other.stockAvailable)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "amountNeeded=" + amountNeeded + ", stockAvailable=" + stockAvailable + ", name=" + name + '}';
    }
    
    
    
}
