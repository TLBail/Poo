package TP3.Exercice3;

public class Principal {

	/*
	//Q1.1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant etu1;
		 EtudiantSportif etu2;
		 etu1= new Etudiant ("AA","Arthur");
		 etu2= new EtudiantSportif("CC","Christophe","Karat�");
		 System.out.println(etu1);
		 System.out.println(etu2);

	}
	//Il est afficher :
	 * AA,Arthur
	 * CC,Christophe,Karat�
	*/
	
	//Q1.2
	/*
	public static void main(String[] args) {
		 Etudiant etu1;
		 etu1= new EtudiantSportif("AA","Arthur","Boxe");
		 System.out.println(etu1);
		}
	 *	Il est afficher :	
	 *   AA,Arthur,Boxe
	 *
	*/
	
	
	//Q1.3
	/*
	public static void main(String[] args) {
		Etudiant etu1;
		 etu1= new EtudiantSportif("AA","Arthur","Boxe");
		 System.out.println(etu1.getSport());
	}
	
	//Affiche une erreur etu1 �tant typ� 
	 * comme un Etudiant etu1 ne poss�de pas 
	 * la m�thode getSport
	*/
	
	
	//Q1.4
	/*
	public static void main(String[] args) {
		Etudiant etu1=new Etudiant("AA","Arthur");
		 EtudiantSportif etu2=new EtudiantSportif("CC","Christophe","Karat�");
		 etu1=etu2;
		 System.out.println(etu1);
	}
	
	//Affiche
	 * CC,Christophe,Karat�
	*/
	
	//Q1.5
	/*
	public static void main(String[] args) {
		Etudiant etu1=new Etudiant("AA","Arthur");
		 EtudiantSportif etu2= new EtudiantSportif("CC","Christophe","Karat�");
		 etu2=etu1;
		 System.out.println(etu2); 
	}
	*/
	//erreur a la compilation on fait un cast implicite ce qui
	//est interdit
	
	//Q1.6
	/*
	public static void main(String[] args) {
		Etudiant etu1=new EtudiantSportif("AA","Arthur","Boxe");
		 etu1.modification("DD","D�d�","Danse");
		 System.out.println(etu1);
	}
	
	//erreur a la compilation 
	 * 
		On apelle la m�thode modification avec 3 argument 
		alors que la m�thode a 2 argument attendue
	*/
	
	//Q1.7
	/*
	public static void main(String[] args) {
		Etudiant etu1=new EtudiantSportif("AA","Arthur","Boxe");
		 etu1.modification("DD","D�d�");
		 System.out.println(etu1);
		
	}
	*/
	//sa marche sa affiche
	//DD,D�d�,Boxe
	
	//Q1.8
	/*
	public static void main(String[] args) {
		Etudiant etu1=new Etudiant("AA","Arthur");
		 EtudiantSportif etu2= new EtudiantSportif("CC","Christophe","Karat�");
		 Etudiant lesEtudiants[] = new Etudiant[2];
		 lesEtudiants[0] = etu1;
		 lesEtudiants[1] = etu2;
		 for (int i=0;i<lesEtudiants.length;i++) {
		 System.out.println(lesEtudiants[i]);
		 }

	}
	//sa marche sa affiche :
	 * AA,Arthur
	 * CC,Christophe,Karat�
	*/
	
	
	
}

