package TP3.Exercice4;

public class Principal {

	public static void main(String[] args) {
		
		
		JeuDeCarte jeu1 = new JeuDeCarte();
		
		jeu1.melangerLePaquet();
		jeu1.AfficherLePaquetDeCarte();
		
		Joueur joueur1 = new Joueur("Marie"), joueur2 = new Joueur("bob");
		
		try {
			for (int i = 0; i < 5; i++) {
				joueur1.ajouterCarte(jeu1.DistribuerCarte());
				joueur2.ajouterCarte(jeu1.DistribuerCarte());

			}
			
		}catch (PlusDecarteException e) {
			// TODO: handle exception
			System.err.println("Il y a plus de carte ");
		}	
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
		
		*/
	}
	
}
