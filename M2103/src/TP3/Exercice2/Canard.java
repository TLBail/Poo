package TP3.Exercice2;

public class Canard extends LesAnimalAvecPattes{
	
	private final static int NB_PATTES_DEFAULT = 2;
	

	public Canard(String race, double poids) {
		super(race, poids, NB_PATTES_DEFAULT);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crier() {
		// TODO Auto-generated method stub
		System.out.println("Salut  a tous c un canard");
		
		
	}
	
	

	
	
}
