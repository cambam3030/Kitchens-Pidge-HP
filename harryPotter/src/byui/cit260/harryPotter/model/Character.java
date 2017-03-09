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
 * @author Cami
 */
public enum Character implements Serializable {
    
    Harry ("The boy who lived"),
    Hermione("Harry's friend"),
    Ron ("Weasley");
    
    //class instance variables
    private final String description;
    private final Point coordinates;
    

     Character() {
    }
    Character(String description){
        this.description = description;
        coordinates = new Point(1,1);

}

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }


       
}
