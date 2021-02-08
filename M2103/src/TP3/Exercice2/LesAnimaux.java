package TP3.Exercice2;

import java.util.*;

public class LesAnimaux {
	
	private List<Animal> animaux;
	
	public LesAnimaux() {
		super();
		animaux = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		String result = "Voici la liste des animaux : \n";
		for(Animal anmial : animaux) {
			result += "--" + anmial.toString() + "\n";
		}
		
		return result;
		
	}
	
	public void ajouter(Animal animal1) {
		animaux.add(animal1);
	}
	
	public void cacaphonie() {
		for (Animal animal : animaux) {
			animal.crier();
		}
	
	}
	
	public void getanimalAvecNbPattes(int nbPattes) {
		for (Animal animal : animaux) {
			if(animal instanceof LesAnimalAvecPattes) {
				LesAnimalAvecPattes animalAvecPattes = (LesAnimalAvecPattes)animal;
				if(animalAvecPattes.getNbPattes() == nbPattes) {
					System.out.println("--" +  animalAvecPattes  + "\n");
				}
			}
			
		}
	}
	

}
