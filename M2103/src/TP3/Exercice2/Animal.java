package TP3.Exercice2;

public abstract class Animal  {

	private String race;
	private double poids;
	 
	public String getRace() {
		return race;
	}
	
	public double getPoids() {
		return poids;
	}
	
	
	public Animal(String race, double poids) {
		this.race = race;
		this.poids = poids;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Race " + race + ", Poids " + poids;
	}
	
	public abstract void crier();
	
	
}
