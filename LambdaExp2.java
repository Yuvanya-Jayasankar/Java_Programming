package first;
interface StringCheck{
	boolean check(String input);
}
public class LambdaExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCheck isFirstLetterCaps = input -> 
	    !input.isEmpty() && Character.isUpperCase(input.charAt(0));
       
	    System.out.println(isFirstLetterCaps.check("Apple"));
	}

}