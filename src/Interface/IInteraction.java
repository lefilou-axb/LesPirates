package Interface;

import personnages.Joueur;

public interface IInteraction {
	public void afficherContexte();
	public void afficherPirate(Joueur joueur);
	public void demanderNom(int numeroJoueur);
	public void choixPirate();
	public void decrireCase(String descriptionCase);
	void erreurCase(String message);
}
