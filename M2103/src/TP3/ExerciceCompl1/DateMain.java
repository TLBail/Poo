package TP3.ExerciceCompl1;

public class DateMain {

	public static void main(String[] args) {
		
		Date date;
		try {
			date = new Date(18, 02, 2021);
			System.out.println(date);
		} catch (DateException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			
		}
	}
}
