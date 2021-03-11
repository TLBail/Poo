package TP3.ExerciceCompl1;

public class Date {
	private static final int ANNEE_MIN = 1582;
	//private static final int[] MOIS_DE_30_JOUR = {4,6,9,11};
	private static final Mois[] MOIS_DE_30_JOUR = {Mois.AVRIL, Mois.JUIN, Mois.SEPTEMBRE, Mois.NOVEMBRE};
	private int jour;
	private Mois mois;
	private int annee;
	
	public int getAnnee() {
		return annee;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois.ordinal() + 1;
	}
	
	
	public Date(int jour, int moisu, int annee) throws DateException {
		
		//verification de l'annee
		if (annee < ANNEE_MIN) throw new DateException("mauvaise anné");
		this.annee = annee;
		
		//verification du mois et conversion du mois
		if(moisu > 12 || moisu < 1) throw new DateException("mauvais moi");
		this.mois = Mois.values()[moisu - 1];
		
		//verification des jour
		for (Mois mois30 : MOIS_DE_30_JOUR) if(mois == mois30 && jour > 30) throw new DateException("mauvais jour");
		if (jour > 31 || jour < 1 || (bissextile() &&  mois == Mois.FEVRIER && jour > 29) || (!bissextile() &&  mois == Mois.FEVRIER && jour > 28)) throw new DateException("mauvaise jour");
		this.jour = jour;
	
		
	}
	
	public void demain() {
		
		jour++;
		
		
		for (Mois mois30 : MOIS_DE_30_JOUR) {
			if(mois == mois30  && jour > 30) {
				if(mois == Mois.DECEMBRE) {
					annee++;
					mois = Mois.JANVIER;
				}else {
					mois = Mois.values()[mois.ordinal() + 1];
				}
				jour = 1;
			}
		}
		
		if (jour > 31 || jour < 1 || (bissextile() &&  mois == Mois.FEVRIER && jour > 29) || (!bissextile() &&  mois == Mois.FEVRIER && jour > 28)) {
			if(mois == Mois.DECEMBRE) {
				annee++;
				mois = Mois.JANVIER;
			}else {
				mois = Mois.values()[mois.ordinal() + 1];
			}
			jour = 1;
		}
		
	}
	
	private boolean bissextile(){
		return ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0));
	}
	
	private String getJourToString() {
		int jourSurSept;
		jourSurSept = (int) (jour + annee + annee/4 - annee/100 + annee /400 + (31* mois.ordinal() + 1) /12 ) % 7;
		
		switch (jourSurSept){
		case(0):
			return  "dimanche";
		case(1):
			return  "lundi";
		case(2):
			return  "mardi";
		case(3):
			return  "mercredi";
		case(4):
			return  "jeudi";
		case(5):
			return  "vendredi";
		case(6):
			return "samedi";
		default:
			return null;
	}

	}
	
	@Override
	public String toString() {
				return "Le " + getJourToString() + "  " + jour + "  " +  mois.toString().toLowerCase() + "  " + annee;
		}
	}






















