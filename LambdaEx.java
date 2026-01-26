package first;
//LAMBDA EXPRESSION 
interface Calculators{
	int calculate(int a,int b);
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculators add =(a,b) ->(a+b);
		Calculators sub = (a,b) -> (a-b);
		
		System.out.println(add.calculate(10,20));
		System.out.println(sub.calculate(10,20));

	}

}
