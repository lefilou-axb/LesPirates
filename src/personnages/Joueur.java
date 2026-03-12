package personnages;

import jeu.PlateauJeu;

public class Joueur {
	private String nom;
	private Pion pion;
	
	public String getNom() { return nom; }
	
	public void deplacerPion(Pion pion) {
		pion.setCase(pion.getCase() + PlateauJeu.lancerDes());
	}
	
	public boolean estATerre(Pion pion) {
		boolean etat = true;
		if(pion.getVie() == 0) {
			etat = false;
		}
		return etat;
	}
}
