package TP3.ExerciceCompl1;

public class TestDateAlancienne {

	public static void main(String[] args) {
		
		try {

			Date uneDateOk = new Date(18, 2, 2021);
			System.out.println(uneDateOk);
		
		} catch (DateException e) {
			System.err.println(e.getMessage());
		}
	}
}
