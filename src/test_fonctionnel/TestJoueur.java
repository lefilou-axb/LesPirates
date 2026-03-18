package test_fonctionnel;

import java.util.Scanner;

import Interface.InteractionJeu;
import personnages.Joueur;

public class TestJoueur {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		InteractionJeu affichage = new InteractionJeu();
		
		affichage.afficherContexte();
		
		// Création des joueurs
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		
		String NomJoueur = sc.nextLine();
		joueur1.setNom(NomJoueur);
		
	}
}
