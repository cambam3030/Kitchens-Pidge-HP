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
    public class LocationDormitory extends ViewMenu{
    
    public LocationDormitory(){
        super("\n You enter the Griffindor Dormitory. Its been a long trip and"
                + "\n you've had a lot to eat. Meet your roommates and get some"
                + "\n sleep! Classes start early tomorrow."
                + "\n"
                + "\n RM - Meet your roommates"
                + "\n S - Get somme sleep"
                + "\n L - leave the Dormitory");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "RM":
                console.println("\n Your roommates are Harry, Ron, and Neville.");
                break;
            case "S":
                console.println("\n zzzzzzZZZZZZZzzzzzzzzZZZZZzzzzzz");
                break;
            case "L"://leave
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}
    

