package TP3.Exercice5;

public class testFile {
	
	
	public static void main(String[] args) {
		
		Folder root = new Folder("/");
		Folder home = new Folder("home", root);
		Folder bin = new Folder("bin", root);
		Folder etu1 = new Folder("etu1", home);
		
		Folder etu2 = new Folder("etu2");
		home.ajouterElement(etu2);
		
		File rien = new File("rien.txt", 100);
		File trombi = new File("trombi.doc", 2400);
		home.ajouterElement(rien);
		home.ajouterElement(trombi);
		
		
		File notes1 = new File("notes.odt", 500);
		etu1.ajouterElement(notes1);
		File notes2 = new File("notes.odt", 400);
		etu2.ajouterElement(notes2);
		
		File essai = new File("essai.sh", 80);
		bin.ajouterElement(essai);
		
		home.afficherContenu();
		home.afficherTaille();
		home.afficheFichier(100);
		
		root.afficherContenu();
	}

}
