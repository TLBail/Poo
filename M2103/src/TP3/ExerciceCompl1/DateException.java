package TP3.ExerciceCompl1;

public class DateException extends Exception{
	
	private String msg;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
	
	public DateException(String msg) {
		super();
		this.msg = msg;
	}

}
