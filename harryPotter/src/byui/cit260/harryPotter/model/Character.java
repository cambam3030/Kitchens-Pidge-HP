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
public class Character implements Serializable {
    
    // remove String for coordinates - make two values, coordinate row, coordinate column
    // create Character selection View - set Character to Game
    
    //class instance variables
    private String name;
    private String description;
    private String coordinates;

    public Character() {
    }
    
    public Character (String name, String description, String coordinates){
     Character[] character = new Character[5];
     
     character[0] = new Character("Harry", "The boy who lived", "1,2");
     character[1] = new Character ("Hermione", "Muggle born", "1,3" );
     character[2] =  new Character ("Ron", "Harry's friend", "1,4");
     character[3] = new Character("Neville", "Longbottom", "1,5");
     character[4] = new Character ("Player Defined", "Player defined", "1,2");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.coordinates);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

   
    
    
}
