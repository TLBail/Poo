package TP3.Exercice4;

public class Carte {
	
	private Couleur couleur;
	private PoidCarte poidCarte;
	
	public Couleur getCouleur() {
		return couleur;
	}
	
	public PoidCarte getPoidCarte() {
		return poidCarte;
	}
	
	public Carte(PoidCarte poidCarte, Couleur couleur) {
		super();
		this.couleur = couleur;
		this.poidCarte = poidCarte;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Carte)) return false;
		Carte obji = (Carte)obj;
		if(!obji.getCouleur().equals(this.couleur)) return false;
		if(!obji.getPoidCarte().equals(this.poidCarte)) return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Carte : \n  [Couleur = " + couleur + " ; PoidCarte = " + poidCarte + " ] ";
	}

}