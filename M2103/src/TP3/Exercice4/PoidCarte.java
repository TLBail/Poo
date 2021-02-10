package TP3.Exercice4;

public enum PoidCarte {
	DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX,
	VALET, DAME, ROIS, AS;
	
	public static PoidCarte getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}
}