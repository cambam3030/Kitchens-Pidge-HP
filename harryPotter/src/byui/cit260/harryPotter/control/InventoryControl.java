/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

import byui.cit260.harryPotter.exceptions.InventoryControlException;

/**
 *
 * @author Cami
 */
public class InventoryControl {
    
    public double qTime;
    public double doseInOunces;
    public double dollars;
    
       public double calcPolyJuice(double weight, double time) 
               throws InventoryControlException{
        // Calculate the amount of Polyjuice potion the user will need to complete a task.
      
    
	if (weight < 100 || weight > 400){ 
		throw new InventoryControlException("Weight must be between 100-400.");
        }

	if (time < 60 || time > 190){ 
		throw new InventoryControlException("Time must be between 60 and 190 seconds.");
        }

	doseInOunces = (weight*2.2)*(time*.00072);

	return doseInOunces;



    }
    public double calcBroomSpeed(double distance, double broomSpeed) 
            throws InventoryControlException{
        // Calculate time it would take to catch up to snitch depending on broom speed and distance.
        
        // establish constant value for snitch
        final double SNITCH = 50;
        // check broom speed; needs to be above 60 and under 200
        if (broomSpeed < 60 || broomSpeed > 200) {
		throw new InventoryControlException("Speed must be between 60 and 200.");
        }
        // check distance; needs to be at least 0 and not greater than 500
	if (distance < 0 || distance > 500) {
		throw new InventoryControlException("Distance must be between 0 and 500.");                
        }
	qTime = distance / ((broomSpeed - SNITCH) / 3);

	return qTime;

    }
    
    public double moneyExchange(double galleons, double sickles) 
            throws InventoryControlException{
      //Convert galleons and sickles into dollars  

	if (galleons < 0 || galleons > 1000) {
		throw new InventoryControlException("Galleons must be between 0 and 1000.");
                }
	if (sickles < 0 || sickles > 1000) {
		throw new InventoryControlException("Sickles must be between 0 and 1000.");
        }

	dollars = (galleons / 2) + ((sickles / 2) * .25);

	return dollars;
    
   }    
    }
    

