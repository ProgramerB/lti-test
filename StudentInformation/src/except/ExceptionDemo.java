package except;

public class ExceptionDemo extends Exception {
	public ExceptionDemo(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
		try {
			throw new ExceptionDemo("Invalid");
		}
		catch(ExceptionDemo e){
			System.out.println(e);
		}
	}
}
