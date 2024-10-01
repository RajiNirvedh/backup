package agregassion;

public class Employee {
		int ID;
	     String name;
		Address address;
	//address reference obj is created as instance variable
	public Employee(String name,int ID,Address address)
		{
			this.name=name;
	this.ID=ID;
			this.address=address;
		}
		public void show()
		{
	System.out.println(ID+" : "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
				}
	public static void main(String[] args) {
	Address object=new Address("Kerala","Trivandrum","India");
	//object created to invoke fst class constructor
	Employee obj=new Employee("RAJI",201,object);
	//object created for current class for display id and employee name
			obj.show();
	}
}
