package super_package;

public class Super_Variable2 extends Super_Variable1 {
	public void Super_Variable()
	{
		System.out.println("Instance variable is x="+super.a);
	}
	
	public Super_Variable2()
	{
		
		super(150);
	}
	public void variable2()
	{
		super.variable1(180);
	}

	public static void main(String[] args) {
		Super_Variable2 obj=new Super_Variable2();
		obj.Super_Variable();
		obj.variable2();
		
		

	}

}
