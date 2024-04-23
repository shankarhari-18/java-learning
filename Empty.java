import java.util.*;
  
public class Empty{
	public static void main (String [] args){
		HashSet<String> list1= new HashSet<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		System.out.println(" list 1 :"+list1);
		list1.removeAll(list1);
		System.out.println("After removing all the elements in list1"+list1);
	}
}