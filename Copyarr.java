import java.util.*;

 public class Copyarr{
	public static void main(String[]args){
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		System.out.println("List 1 : "+list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("10");
		list2.add("20");
		list2.add("30");
		list2.add("40");
		list2.add("50");
		System.out.println("List 2 : "+list2);
		System.out.println("after copying list 2 to list 1"); 
		Collections.copy(list1,list2);
		System.out.println("list 1 : "+list1);
		System.out.println("list 2 : "+list1);
		
		
		
	
		
	}
}