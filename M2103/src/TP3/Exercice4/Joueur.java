package TP3.Exercice4;

import java.util.*;


public class Joueur {
	
	public Set<Carte> paquet;
	private String nom;
	
	
	public Joueur(String nom) {
		super();
		this.nom = nom;
		paquet = new HashSet<>();
	}
	
	/*
	public Carte[] carteDeLaPair() {
		for (int i = 0; i < paquet.length; i++) {
			for (int j = i + 1; j < paquet.length; j++) {
				if(paquet[i].getPoidCarte() == paquet[j].getPoidCarte()) {
					Carte carte[] =  {paquet[i], paquet[j]};
					return carte;
				}
			}
		}
		return null;
	}
	
	public Carte[] carteDuBrollan() {
		for (int i = 0; i < paquet.length; i++) {
			for (int j = i + 1; j < paquet.length; j++) {
				for (int g = j + 1; g < paquet.length; g++) {
					if(paquet[i].getPoidCarte() == paquet[j].getPoidCarte() && paquet[i].getPoidCarte() == paquet[g].getPoidCarte() ) {
						Carte carte[] =  {paquet[i], paquet[j], paquet[g]};
						return carte;
					
					}
				}
			}
		}
		return null;
	}
	
	*/
	
	public PoidCarte getPoidPremierePairePresente() {
		Carte cartes[] = (Carte[])paquet.toArray();
		for (int i = 0; i < cartes.length; i++) {
			for (int j = i + 1; j < cartes.length; j++) {
				if(cartes[i].getPoidCarte() == cartes[j].getPoidCarte()) {
					return cartes[i].getPoidCarte();
				}
			}
		}
		return null;
	}
	
	
	
	public void ajouterCarte(Carte carteAajouter) {
		paquet.add(carteAajouter);
	}
	
	
	@Override
	public String toString() {
		StringBuilder toReturn = new StringBuilder();
		for (Carte carte : paquet) {
			toReturn.append(" -- " + carte.toString() + "\n");
		}
		return toReturn.toString();
	}

}
