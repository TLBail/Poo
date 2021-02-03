package TP3.Exercice2;

public class Chien extends LesAnimalAvecPattes {
	
	

	private static final int NB_PATTES_DEFAULT = 4;
	
	private int categorie;
	
	public int getCategorie() {
		return categorie;
	}
	
	
	
	public Chien(String race, double poids, int categorie) {
		super(race, poids, NB_PATTES_DEFAULT);
		this.categorie = categorie;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void crier() {
		// TODO Auto-generated method stub
		System.out.println("Salut a tous c le chien");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", categorie " + categorie;
		
		
	}
	
}
