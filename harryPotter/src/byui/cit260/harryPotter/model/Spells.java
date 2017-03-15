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
public enum Spells implements Serializable{
    //class instance variables
    
                Alohamora("Unlock"),
                WingardiumLeviosa("Levitate"),
                Expelliarmus("Disarm"),
                Obliviate("WipeMemory"),
                Lumos("Illuminate"),
                Knox("Darken"),
                PetrificusTotalis("BodyBind"),
                Reparo("Repair"),
                Protego("Sheild");


   
   private String effect;
   
    
    Spells(String effect){

     this.effect = effect;
}
   public String getEffect(){
        return effect;
    }

    

    
    @Override
    public String toString() {
        return "Spells{" + "effect=" + effect + '}';
    }
    
    
}
