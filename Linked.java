import java.util.*;

public class Linked{
	public static void main(String[]args){
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("dog");
		list1.add("cat");
		list1.add("tiger");
		list1.add("lion");
		System.out.println("List : "+list1);
		Collections.reverse(list1);
		System.out.println("list after reverse : "+list1);
		
		
		
	}
}