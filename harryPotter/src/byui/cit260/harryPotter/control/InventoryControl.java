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
    

