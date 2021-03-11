package TP3.Exercice4;

import java.util.*;

public class JeuDeCarte {
	
	
	private List<Carte> paquetDeCarte = new ArrayList<Carte>();
	public JeuDeCarte() {
		super();
		boolean isAnewCarte;
		Carte carto;
		System.out.println("Debut generation d'un nouveau paquet de carte");
		
		for (PoidCarte poid : PoidCarte.values()) {
			for (Couleur couleur : Couleur.values()) {
				paquetDeCarte.add(new Carte(poid, couleur));
			}
		}
		
		System.out.println("fin generation d'un nouveau paquet de carte");
	}
	
	public void melangerLePaquet() {
		Collections.shuffle(paquetDeCarte);
	}
	
	
	public void AfficherLePaquetDeCarte() {
		for (Carte carte : paquetDeCarte) {
			System.out.println(carte);
		}
	}
	
	
	public Carte DistribuerCarte() throws PlusDecarteException {
		if(paquetDeCarte.isEmpty()) throw new PlusDecarteException();
		return paquetDeCarte.remove(paquetDeCarte.size() - 1);
	}
}
