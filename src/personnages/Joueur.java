package personnages;

import jeu.PlateauJeu;

public class Joueur {
	private String nom;
	private Pion pion;
	PlateauJeu plateau = new PlateauJeu();
	
	public String getNom() { return nom; }
	
	public void setNom(String nom) { this.nom = nom; }
	
	public void deplacerPion(Pion pion) {
		pion.setCase(pion.getCase() + plateau.lancerDes());
	}
	
	public boolean estATerre(Pion pion) {
		boolean etat = true;
		if(pion.getVie() == 0) {
			etat = false;
		}
		return etat;
	}
}
