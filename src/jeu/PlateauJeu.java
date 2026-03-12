package jeu;
import java.security.SecureRandom;

import Interface.AffichageJeu;
import emplacements.Case;

public class PlateauJeu {
	private int nbCases = 30;
	private int nbCasesSpeciales;
	private int[] resultatDes;
	private SecureRandom random;
	
	
	public int lancerDes(){
		random = new SecureRandom();
		this.resultatDes[0] = random.nextInt(11);
		return resultatDes[0];
	}
	
	public void ajouterCaseSpeciale(Case caseSpeciale, int numero) {
		if(nbCasesSpeciales == nbCases) {
			AffichageJeu.erreur("Impossible de rajouter plus de case spéciale, désolé moussaillon.");
		} else {
			nbCasesSpeciales += 1;
		}
	}
}
