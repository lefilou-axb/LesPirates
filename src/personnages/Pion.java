package personnages;

public class Pion {
	private int pCase = 0;
	private int nbVie = 5;
	private Pirate pirate;
	private Joueur joueur;
	
	public int getVie() { return nbVie; }
	
	public int getCase() { return pCase; }
	public void setCase(int newCase) { pCase = newCase; }
}
