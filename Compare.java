import java.util.*;

public class Compare{
	public static void main(String[] args){
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		System.out.println("linked list : "+list2);
		Collections.shuffle(list2);
		System.out.println("linked list after shuffle : "+list2);
	}
}