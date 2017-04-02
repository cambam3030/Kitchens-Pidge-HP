/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

/**
 *
 * @author Cami
 */
   public class LocationCharms extends ViewMenu{
    
    public LocationCharms(){
        super("\n Welcome to Charms class! Today you will have the chance to choose"
                + "\n which spells you want to master. Your choices are;"
                + "\n"
                + "\n W - Wingardium Leviosa- Levitation Charm"
                + "\n R - Reparo- Mending Charm"
                + "\n L - Lumos- Wand-Lighting Charm"
                + "\n K - Knox- Wand-Extinguishing Charm"
                + "\n H - Ask Hermione for Help"
                + "\n E - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "W": //Levitation charm
                console.println("\n Raise your wand and point it at the object"
                        + "\n that you want to levitate. Gently swish your wand"
                        + "\n and then give it a little flick. The key to this"
                        + "\n charm is the movement in your wrist. It is pronounced"
                        + "\n wing-GAR-dee-um levi-O-sa");
                break;    
            case "R": //Mending Charm
                console.println("\n Raise your wand and point it at the object"
                        + "\n that you want to repair. This charm requires a"
                        + "\n quick circular motion. It is pronounced"
                        + "\n reh-PAH-ro");
                break; 
            case "L": //Wand-Lighting Charm
                console.println("\n Rais your wand in front of you and speak the"
                        + "\n charm clearly. This one does not require wand motion."
                        + "\n It is pronounced LOO-mos.");
                break; 
            case "K": //Wand-Extinguishing Charm
                console.println("\n With your wand still raised from using Lumos"
                        + "\n click your hand slightly to the right while speaking"
                        + "\n the charm. It is pronounced NOCK-ss.");
                break; 
            case "H": //Ask for help.
                console.println("\n You have been too busy talking Ron"
                        + "\n instead of paying attention, so Hermione has offered"
                        + "\n her help. 'It's pronounced Levi-O-sa, no Levio-SAH!");
                break;
                case "E": //Exit
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}
    

