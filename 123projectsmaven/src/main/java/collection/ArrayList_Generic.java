package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> obj=new ArrayList<String>();
obj.add("RAJI");
obj.add("HI");
obj.add("VEENA");
//obj.add(3,"ORANGE");//add some extra value to a particular index value
//System.out.println(obj);
	
 Iterator itr=obj.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
	}
}
