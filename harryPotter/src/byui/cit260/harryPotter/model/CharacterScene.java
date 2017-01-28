/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.model;

import java.util.Objects;


public class CharacterScene extends Scene {
    
    
    //class instance vairables
    private String name;
    private String creature;
    private String friendFoe;
    private String location;
    private String met;
    private double amountRemaining;

    public CharacterScene() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreature() {
        return creature;
    }

    public void setCreature(String creature) {
        this.creature = creature;
    }

    public String getFriendFoe() {
        return friendFoe;
    }

    public void setFriendFoe(String friendFoe) {
        this.friendFoe = friendFoe;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMet() {
        return met;
    }

    public void setMet(String met) {
        this.met = met;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.creature);
        hash = 71 * hash + Objects.hashCode(this.friendFoe);
        hash = 71 * hash + Objects.hashCode(this.location);
        hash = 71 * hash + Objects.hashCode(this.met);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "CharacterScene{" + "name=" + name + ", creature=" + creature + ", friendFoe=" + friendFoe + ", location=" + location + ", met=" + met + ", amountRemaining=" + amountRemaining + '}';
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
        final CharacterScene other = (CharacterScene) obj;
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.creature, other.creature)) {
            return false;
        }
        if (!Objects.equals(this.friendFoe, other.friendFoe)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.met, other.met)) {
            return false;
        }
        return true;
    }
    
    
            
}
