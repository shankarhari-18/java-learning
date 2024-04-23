import java.util.*;

public class Compare2{
	public static void main(String[]args){
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("ab");
		list1.add("bc");
		list1.add("cd");
		list1.add("de");
		System.out.println("list1 : "+list1);
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("ab");
		list2.add("bc");
		list2.add("cd");
		list2.add("de");
		System.out.println("list2 : "+list2);
		LinkedList<String> list3=new LinkedList<String>();
		for(String b:list1)
			list3.add(list2.contains(b)? "yes" : "no");
		System.out.println("list1 compares list2"+list3);
	}
}