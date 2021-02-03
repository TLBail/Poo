package TP3.Exercice2;

public class LesAnimalSansPatte extends Animal {
	
	private double longueur;
	

	public LesAnimalSansPatte(String race, double poids, double longueur) {
		super(race, poids);
		this.longueur = longueur;
		// TODO Auto-generated constructor stub
	}
	
	public double getLongueur() {
		return longueur;
	}

	@Override
	public void crier() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", Longeur " + longueur;
	}
	

	
	
}
