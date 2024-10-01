package agregassion;

public class Student_details_class {
 String name;
 int id;
 Marks_class obj;
 public Student_details_class(String name,int id,Marks_class obj)
 {
	 this.name=name;
	 this.id=id;
	 this.obj=obj;
 }
 public void student()
 {
	 System.out.println("Student name : "+name);
	 System.out.println("Student id   : "+id);
	 System.out.println("Student marks");
	 System.out.println("Maths : "+obj.maths);
	 System.out.println("Malayalam : "+obj.mal);
	 System.out.println("Science : "+obj.science);
	 
 }
	public static void main(String[] args) {
		Marks_class objec=new Marks_class(56,65,53);
		Student_details_class object1=new Student_details_class("RAJI",123,objec);
		object1.student();
		
	}
}
