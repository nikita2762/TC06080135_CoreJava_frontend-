package Example54;

//InvalidFeeException class
public class InvalidFeeException extends Exception
{
	
	public InvalidFeeException(String message) {
		
		super(message);
	}
}


/*
 54 . Create Interface StudentFee and declare following method.

getFee() throws Invalid Fee Exception. This method ask fees from user and throws

exception if user enters invalid or negative fees

Create class Student with members (name, fees) and implement the StudentFee Interface.
*/
