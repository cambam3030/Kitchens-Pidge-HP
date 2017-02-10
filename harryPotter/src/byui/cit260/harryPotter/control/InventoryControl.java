/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

/**
 *
 * @author Cami
 */
public class InventoryControl {
       public double calcPolyJuice(double weight, double time){
        // Calculate the amount of Polyjuice potion the user will need to complete a task.
      
    
	if (weight < 100 || weight > 400) 
		return -1;

	if (time < 60 || time > 190) 
		return -1;

	double doseInOunces = (weight*2.2)*(time*.00072);

	return doseInOunces;



    }
    public double calcBroomSpeed(double distance, double broomSpeed){
        // Calculate time it would take to catch up to snitch depending on broom speed and distance.
        
        // establish constant value for snitch
        double SNITCH = 50;
        // check broom speed; needs to be above 60 and under 200
        if (broomSpeed < 60 || broomSpeed > 200) {
		return -1;
        }
        // check distance; needs to be at least 0 and not greater than 500
	if (distance < 0 || distance > 500) {
		return -1;
        }
	double time = distance / ((broomSpeed - SNITCH) / 3);

	return time;

    }
    
    public double moneyExchange(double galleons, double sickles){
      //Convert galleons and sickles into dollars  

	if (galleons < 0 || galleons > 1000) {
		return -1;
                }
	if (sickles < 0 || sickles > 1000) {
		return -1;
        }

	double dollars = (galleons / 2) + ((sickles / 2) * .25);

	return dollars;
    
   }    
    }
    

