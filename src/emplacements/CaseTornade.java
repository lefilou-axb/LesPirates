package emplacements;

import personnages.Pion;

public class CaseTornade extends CaseSpeciale{
	
	@Override
	public void appliquerEffet(Pion pion1, Pion pion2) {
		int caseIntermediare = pion1.getCase();
		pion1.setCase(pion2.getCase());
		pion2.setCase(caseIntermediare);
	}


}
