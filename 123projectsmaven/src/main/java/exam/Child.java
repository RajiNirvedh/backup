package exam;

public class Child implements Parent1,Parent2{
	public void show()
	{
		System.out.println("Parent");
	}
public void show1()
{
	System.out.println("HI");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj=new Child();
		obj.show();
		obj.show1();
	}

}
