package Interface;

import personnages.Joueur;

public class AffichageJeu implements IAffichage {
	
	@Override
	public void afficherContexte() {
		System.out.println("Salut mousaillon ! Bienvenue sur la mythique île des pirates 💀. Tu tombes à pic "
				+ "pour l'annuel combat des pirates ! \n\n Le but est très simple ! Il faut être le premier à"
				+ " atteindre le bout de l'île. \n\n Comment t'appelles-tu ?");
	}
	
	@Override
	public void afficherPirate(Joueur joueur) {
		System.out.println(joueur.getNom());
	}
	
	@Override
	public void decrireCase(String descriptionCase) {
		System.out.println("Cette case spéciale permet "+ descriptionCase);
	}
	
	@Override
	public void erreur(String message) {
		System.out.println("Impossible : " + message);	
	}
}
