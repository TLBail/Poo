package TP3.Exercice4;

import java.awt.JobAttributes;

public class Test {

	public static void main(String[] args) {
		
		
		JeuDeCarte jeu1 = new JeuDeCarte();
		
		
		jeu1.melangerLePaquet();
		jeu1.AfficherLePaquetDeCarte();
		
		Joueur joueur1 = new Joueur(), joueur2 = new Joueur();
		
		jeu1.DistribuerCarte(joueur1, joueur2);
		
		System.out.println("\n \n Les Carte ont été distribué \n \n");
		
		jeu1.AfficherLePaquetDeCarte();

		System.out.println("\n \n voici les cartes des deux joueur \n \n");
		
		System.out.println("Joueur 1");
		
		for (Carte carte : joueur1.paquet) {
			System.out.println(carte);
		}
		
		System.out.println("\n\njoueur2" );
		
		for (Carte carte : joueur2.paquet) {
			System.out.println(carte);
		}
		
		/*
		Joueur joueurTest = new Joueur();
		joueurTest.paquet[0] = new Carte(PoidCarte.AS, Couleur.CARRE);
		joueurTest.paquet[4] = new Carte(PoidCarte.AS, Couleur.CARRE);
		joueurTest.paquet[2] = new Carte(PoidCarte.AS, Couleur.PIQUE);
		joueurTest.paquet[3] = new Carte(PoidCarte.AS, Couleur.TREFLE);
		joueurTest.paquet[1] = new Carte(PoidCarte.AS, Couleur.CARRE);
		*/
		
		
		System.out.println("\n\nLe joueur 1 a t'il une pair");
		if(joueur1.carteDeLaPair() != null) {
			System.out.println("Oui voici les carte");
			for (Carte carte : joueur1.carteDeLaPair()) {
				System.out.println(carte);
			}
		}else {
			System.out.println("non");
		}
		
		System.out.println("\n\nLe joueur 2 a t'il une pair ");
		if(joueur2.carteDeLaPair() != null) {
			System.out.println("Oui voici les carte");
			for (Carte carte : joueur2.carteDeLaPair()) {
				System.out.println(carte);
			}
		}else {
			System.out.println("non");
		}
		
		System.out.println("\n\nLe joueur 1 a t'il un brollan ");
		if(joueur1.carteDuBrollan() != null) {
			System.out.println("Oui voici les carte");
			for (Carte carte : joueur1.carteDuBrollan() ) {
				System.out.println(carte);
			}
		}else {
			System.out.println("non");
		}
		
		
		System.out.println("\n\nLe joueur 2 a t'il un brollan");
		if(joueur2.carteDuBrollan() != null) {
			System.out.println("Oui voici les carte");
			for (Carte carte : joueur2.carteDuBrollan() ) {
				System.out.println(carte);
			}
		}else {
			System.out.println("non");
		}
		
	
	}
	
}
