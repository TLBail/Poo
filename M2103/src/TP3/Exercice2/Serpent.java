package TP3.Exercice2;

public class Serpent extends LesAnimalSansPatte{

	public Serpent(String race, double poids, double longueur, boolean venimeux) {
		super(race, poids, longueur);
		this.venimeux = venimeux;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	private boolean venimeux;
	
	public final static boolean VENIMEUX = true;
	public final static boolean PAS_VENIMEUX = false;
	
	
	
	public boolean isVenimeux() {
		return venimeux;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Venimeux " + ((venimeux)?"oui":"non");
		
	}
	
	@Override
	public void crier() {
		// TODO Auto-generated method stub
		super.crier();
		System.out.println("Salut  tous c le serpent");
	}
	
}
