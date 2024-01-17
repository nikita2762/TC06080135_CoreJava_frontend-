package Example53;
//
//public class MyException extends Exception{
//	
//	@Override
//	public String toString() {
//		return "MyException []";
//	}
//}
class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}