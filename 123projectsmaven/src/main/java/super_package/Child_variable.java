package super_package;

public class Child_variable extends Parent_variable{
	int a;
	public void variable(int a)
	{
		
	   System.out.println("Parent class instance variable a= "+super.a);
		this.a=a;
		System.out.println("Child class variable a= "+a);
		
		
	}

	public static void main(String[] args) {
		Child_variable obj=new Child_variable();
		obj.variable(1000);
	}

}
