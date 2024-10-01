package acess_modifiers;

public class Protected2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected1 obj=new Protected1();
		obj.show();//within the package and outside the package visibility is possible
		//outside the package is possible by creating object with this childclass (this)
		}

}
