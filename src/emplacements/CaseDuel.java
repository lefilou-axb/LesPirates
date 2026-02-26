package emplacements;

import java.security.SecureRandom;

import personnages.Pion;


public class CaseDuel extends CaseSpeciale {
	private SecureRandom random;
	
	public CaseDuel(){
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void appliquerEffet(Pion pion1, Pion pion2){
		int vie = random.nextInt(5);
		pion1.setVie(pion1.getVie() - vie);
		pion2.setVie(pion2.getVie() + vie);
	}
}
