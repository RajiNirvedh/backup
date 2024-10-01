package agregassion;

public class Family {
	String c,d;
	Age obj;
	public Family(String c,String d,Age obj)
	{
		this.c=c;
		this.d=d;
		this.obj=obj;
	}
public void show()
{
	System.out.println("Grandfather "+c+" age is "+obj.a);
	System.out.println("Father "+d+" age is "+obj.b);
	}
	public static void main(String[] args) {
		Age object=new Age(88,56);
		Family object1=new Family("Appu","Rajendran",object);
		object1.show();
		

	}

}
