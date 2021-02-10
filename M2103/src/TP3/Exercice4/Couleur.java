package TP3.Exercice4;

public enum Couleur {
	PIQUE, CARRE, COEUR, TREFLE;
	
	public static Couleur getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}
}