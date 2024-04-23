import java.util.*;

 public class Iterate_treeset{
	public static void main(String[]args){
		TreeSet<String> list1=new TreeSet<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		//for(String list2 :list1){
		//	System.out.println(list2);
		//}
		Iterator iterat= list1.iterator();
		while(iterat.hasNext()){
			System.out.println(iterat.next());
		}
	}
 }
		