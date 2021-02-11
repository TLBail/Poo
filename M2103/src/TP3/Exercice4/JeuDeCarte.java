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
	
	
	public void DistribuerCarte(Joueur joueur1, Joueur joueur2) {
		for (int i = 0; i < 5 ; i++) {
			joueur1.paquet[i]  = paquetDeCarte.get(paquetDeCarte.size() - 1); 
			paquetDeCarte.remove(paquetDeCarte.size() - 1);
			joueur2.paquet[i]  = paquetDeCarte.get(paquetDeCarte.size() - 1); 
			paquetDeCarte.remove(paquetDeCarte.size() - 1);
		}
	}
}
