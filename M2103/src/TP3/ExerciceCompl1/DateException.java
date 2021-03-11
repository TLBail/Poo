package TP3.ExerciceCompl1;

public class DateException extends Exception{

	private String msg;
	
	public DateException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
