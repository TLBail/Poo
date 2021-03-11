package TP3.ExerciceCompl1;

public class Date {

	private static final int ANNE_MIN = 1582;
	private int jour;
	private int mois;
	private int annee;
	
	public int getAnnee() {
		return annee;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public  Date(int jour , int mois , int anne) throws DateException {
		super();
		if (anne < ANNE_MIN) {
			throw new DateException("Annee incorect");
		}
		
		this.annee = annee;
		
		if (mois > 12 || mois < 1) {
			throw new DateException("Mois inccorect");
		}
		int moisImpair[] = {3, 5, 7, 10, 11};
		for (int a :  moisImpair) {
			if(a == mois && jour > 30) {
				throw new DateException("Jour inccorecr");
				
			}
		}
		if (jour > 31 || jour < 1 || (mois == 2 && jour > 27)) {
			throw new DateException("Jour incoret");
			
		}
	}
	
	public void demain() {
		jour++;
		int moisImpair[] = {3, 5, 7, 10, 11};
		for (int a :  moisImpair) {
			if(a == mois && jour > 30) {
				mois++;
				jour = 1;
				
			}
		}
		if (jour > 31 || jour < 1 || (mois == 2 && jour > 27)) {
			mois++;
			jour = 1;
			
		}
			
	}
	
	    
	private boolean bissextile() {
		
		return ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0);
	}
		
	@Override
	public String toString() {
		String smois = "";
		return jour + smois + annee;
	}	
	
}
