/**
 * 
 */
package tp06;

import java.time.LocalDate;

/**
 * @author flore
 *
 */
public class Prof extends Personne {

	public Prof(String nom, String prenom, LocalDate naissance, LocalDate arrive) throws DateArriveeInvalideException{
		super(nom, prenom, naissance, arrive);
		
	}
	
	public int getAnciennete() {
		if (super.getNaissance().until(getArrive()).getYears() < 23) {
			int soustr = super.getNaissance().until(getArrive()).getYears() - 23;
			return (super.getArrive().until(LocalDate.now()).getYears() + soustr);
		}
		return (super.getArrive().until(LocalDate.now()).getYears());
	}



}
