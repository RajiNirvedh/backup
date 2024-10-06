package exam;

public class Aritmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=110/0;
		}
		catch(ArithmeticException obj)
		{
			System.out.println(obj+" Arithmeticexception handled");
		}

	}

}
