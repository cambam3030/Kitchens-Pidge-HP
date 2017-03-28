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
public enum Spells implements Serializable {
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

    public static String[] printSpells() {
        String[] spells = {"Alohamora ", "Wingardium Leviosa", "Expelliarmus", "Obliviate",        
        " Lumos", "Knox", "Felix Felices", "Petrificus Totalis", "Reparo", "Protego"};
        return spells;
    }

    private String effect;

    Spells(String effect) {

        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    
    
}
