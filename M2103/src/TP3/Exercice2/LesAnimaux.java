package TP3.Exercice2;

public class LesAnimaux {
	
	public static void main(String[] args) {
		Chien chien1 = new Chien("Labrador" , 15, 4);
		chien1.setNbPattes(5);
		
		Canard canard1 = new Canard("Salut", 0);
		
		Serpent serpent1 = new Serpent("LOng", 34, 35, false);
		System.out.println(chien1.toString());
		System.out.println(canard1.toString());
		System.out.println(serpent1.toString());
		
	}
	
	

}
