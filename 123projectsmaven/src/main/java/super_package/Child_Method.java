package super_package;

public class Child_Method extends Parent_method {
	public void method1(String b)
	{
		super.method1("HI");
		System.out.println("Child method get invoked "+b);
	}

	public static void main(String[] args) {
		
		Child_Method obj=new Child_Method();
		obj.method1("HELLO");
	}

}
