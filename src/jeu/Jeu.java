package jeu;

import java.util.Scanner;

import Interface.InteractionJeu;
import personnages.Joueur;
import personnages.Pion;
import personnages.Pirate;

public class Jeu {
	private int nbJoueurs;
	InteractionJeu interaction = new InteractionJeu();
	Scanner sc = new Scanner((System.in));
	Joueur joueur1;
	Joueur joueur2;
	Pion pion1;
	Pion pion2;
	
	public void creerJoueur(String nom, Pion pion, Joueur joueur) {
		int choixPirate;
		String saisie = sc.nextLine();
		
		joueur = new Joueur(nom, pion);
		interaction.choixPirate();
		try {
		    Pirate monPirate = Pirate.valueOf(saisie);
		    pion = new Pion(monPirate, joueur);
		} catch (IllegalArgumentException e) {
		    System.out.println("Ce pirate n'existe pas dans la liste !");
		}
		
	}
	
	public void demarrerJeu() {
		interaction.afficherContexte();
		
		//Initialisation joueur 1
		interaction.demanderNom(1);
		String nomJoueur1 = sc.nextLine();
		creerJoueur(nomJoueur1, pion1, joueur1);
		
		//Initialisation joueur 2
		interaction.demanderNom(2);
		String nomJoueur2 = sc.nextLine();
		creerJoueur(nomJoueur2, pion2, joueur2);
		
		
		
		
		
		
		
	}
}
