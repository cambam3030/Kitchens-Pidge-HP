/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author chriskitchens
 */
public class Potions extends Inventory implements Serializable{
    // class instance variables
    private String ingredients;
    private String effect;

    public Potions() {
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.ingredients);
        hash = 13 * hash + Objects.hashCode(this.effect);
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
        final Potions other = (Potions) obj;
        if (!Objects.equals(this.ingredients, other.ingredients)) {
            return false;
        }
        if (!Objects.equals(this.effect, other.effect)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Potions{" + "ingredients=" + ingredients + ", effect=" + effect + '}';
    }
    
    
    
}
