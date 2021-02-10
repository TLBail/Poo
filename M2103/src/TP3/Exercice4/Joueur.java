package TP3.Exercice4;

public class Joueur {
	
	public Carte paquet[] = new Carte[5];

	
	
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
	

}
