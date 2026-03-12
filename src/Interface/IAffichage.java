package Interface;

import personnages.Joueur;

public interface IAffichage {
	public void afficherContexte();
	public void afficherPirate(Joueur joueur);
	public void decrireCase(String descriptionCase);
	void erreur(String message);
}
