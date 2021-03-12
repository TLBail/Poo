package TP3.Exercice5;

import java.util.ArrayList;

public class Folder extends Element{

	
	public ArrayList<Element> elements = new ArrayList<>();
	public Folder dossierParent;
	
	
	public Folder(String string) {
		super(string);
		dossierParent = this;
	}
	
	public Folder(String string, Folder dossierParent) {
		super(string);
		this.dossierParent = dossierParent;
		dossierParent.ajouterElement(this);
	}

	public void afficherContenu() {
		System.out.println(this.toString());
	}
	
	public void afficherTaille() {
		System.out.println("taille du dossier  :  " + getTaille());
	}

	//getTaille est déclarer abstraite dans élément  et redéfini
	@Override
	public int getTaille() {
		int sum = 0;
		for (Element element : elements) {
			sum += element.getTaille();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		String sum = "-le dossier " + super.toString() + " posssède les élément suivant\n";
		for (Element element : elements) {
			sum += "--"+element.toString()+"\n";
		}// TODO Auto-generated method stub
		sum += "---fin de " + super.toString();
		return sum;
	}
	
	public void ajouterElement(Element element) {
		elements.add(element);
	}
	
	public void afficheFichier(int taille) {
		for (Element element : elements) {
			if(element instanceof File && element.getTaille() == taille) 
				System.out.println("elément de " + taille + " trouvé " + element.toString());
		}
	}
	
	
	
}
