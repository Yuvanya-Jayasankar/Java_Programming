package first;
//INTERFACE WITH FUNCTIONAL INTERFACE EXAMPLE
@FunctionalInterface   //Annotation
interface validator
{
boolean validator(String input);
}
 
public class InterfaceTest1
{
public static void main(String[] args)
{
	//LAMBDA EXPRESSION
validator emailCheck=email->email.contains("@");
 
System.out.println(emailCheck.validator("test@gmail.com"));
}
 
}
