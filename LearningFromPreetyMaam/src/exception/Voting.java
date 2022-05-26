package exception;
class UnderAge extends RuntimeException{
	UnderAge(){
		super("You are under age");
	}
	UnderAge(String message){
		super(message);
	}
//	public String getMessage(){
//		return "Age not more than 18";
//	}
}
public class Voting {
	public static void main(String[] args) {
		int age =16;
		try {
			if(age<18) {
				throw new UnderAge("You can't vote as of now as you currently are not more than 18 years old.");
				
			}
			else {
				System.out.println("You can vote now..");
			}
		}
		catch(UnderAge e) {
				System.out.println(e.getMessage());
		}
	}
}


//public class StringParse {
//    //Write logic to find the character from the sentence at specified location
//    public char characterLocator(String sentence, String location) {
//        try {
//    	int position = Integer.parseInt(location);
//        return sentence.charAt(position);
//        }
//        catch (Exception e)
//        {
//        	throw (e);
//        }
//        
//    }
//}