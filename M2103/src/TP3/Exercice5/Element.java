package TP3.Exercice5;

public abstract class Element {

	private static final String DEFAULT_NAME = "nouveauElement";
	
	private String nom;
	protected int taille;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public Element(String nom) {
		super();
		this.nom = nom;
	}
	
	public Element() {
		this(DEFAULT_NAME);
	}
	
	public abstract int getTaille();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nom : " + nom + "  taille  : " + getTaille();
	}
	
}
