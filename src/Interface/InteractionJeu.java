package Interface;

import personnages.Joueur;

public class InteractionJeu implements IInteraction {
	
	@Override
	public void afficherContexte() {
		System.out.println("Salut mousaillon ! Bienvenue sur la mythique île des pirates 💀. Tu tombes à pic "
				+ "pour l'annuel combat des pirates ! \n\nLe but est très simple ! Il faut être le premier à"
				+ " atteindre le bout de l'île.\n\n");
	}
	
	@Override
	public void afficherPirate(Joueur joueur) {
		System.out.println(joueur.getNom());
	}
	
	@Override
	public void demanderNom(int numeroJoueur) {
		System.out.println("Entrez votre nom joueur " + numeroJoueur + " : ");
	}
	
	public void choixPirate() {
		System.out.println("Veuillez choisir votre pirate en sélectionnant le numéro : "
				+ "1 - Capitaine Crochet, 2 - Monkey D.Luffy, 3 - Jack Sparrow, "
				+ "4 - Flameheart, 5 - Victor Macbernik");
	}
	
	@Override
	public void decrireCase(String descriptionCase) {
		System.out.println("Cette case spéciale permet "+ descriptionCase);
	}
	
	@Override
	public void erreurCase(String message) {
		System.out.println("Impossible : " + message);	
	}
}
