package super_package;

public class Child_constructor extends Parent_constructor {
	public Child_constructor(int b)
	{
		super(200);
		System.out.println("Child class constructor is invoked "+b);
	}

	public static void main(String[] args) {
		Child_constructor obj=new Child_constructor(10000);
	
	}

}
