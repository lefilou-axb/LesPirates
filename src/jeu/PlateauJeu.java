package jeu;
import java.security.SecureRandom;

public class PlateauJeu {
	private int nbCases = 30;
	private int nbCasesSpeciales;
	private int[] resultatDes;
	private SecureRandom random;
	
	
	public void lancerDes(){
		random = new SecureRandom();
		this.resultatDes[0] = random.nextInt(11);
	}
	
	public void ajouterCaseSpeciale(Case caseSpeciale, int numero) {
		
	}
}
