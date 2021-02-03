package TP3.Exercice2;

public abstract class LesAnimalAvecPattes extends Animal{
	
	private int nbPattes;
	
	public int getNbPattes() {
		return nbPattes;
	}
	
	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", nbPattes " + nbPattes;
	}

	public LesAnimalAvecPattes(String race, double poids, int nbPattes) {
		super(race, poids);
		this.nbPattes = nbPattes;
		// TODO Auto-generated constructor stub
	}

	public abstract void crier();

	
	
}
