package TP3.Exercice2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Chien chien1 = new Chien("Labrador" , 15, 4);
		chien1.setNbPattes(5);
		Canard canard1 = new Canard("superCanard", 25);		
		Serpent serpent1 = new Serpent("LOng", 34, 35, false);

		LesAnimaux myAnimaux = new LesAnimaux();
		myAnimaux.ajouter(serpent1);
		myAnimaux.ajouter(canard1);
		myAnimaux.ajouter(chien1);
		
		System.out.println(myAnimaux.toString());
		myAnimaux.cacaphonie();
		
		myAnimaux.getanimalAvecNbPattes(5);
		
	}

}
