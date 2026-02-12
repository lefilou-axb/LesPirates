package personnages;

public class Joueur {
	private String nom;
	private Pion pion;
	
	public void deplacerPion(Pion pion) {
		pion.setCase(pion.getCase() + plateauJeu.lancerDes());
	}
	
	public boolean estATerre(Pion pion) {
		boolean etat = true;
		if(pion.getVie() == 0) {
			etat = false;
		}
		return etat;
	}
}
