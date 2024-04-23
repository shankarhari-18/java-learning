import java.util.*;

public class Common{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		ArrayList<String> list1=new ArrayList<String>();
		
		for(int x=0;x<5;x++){
			System.out.print("LIST  "+(x+1)+":");
			list1.add(scan.next());
		}
		System.out.println("LIST 1 : "+list1+"\n");
		
		ArrayList<String> list2=new ArrayList<String>();
		for(int y=0;y<5;y++){
			System.out.print("LIST  "+(y+1)+":");
			list2.add(scan.next());
		}
		System.out.println("LIST 2 : "+list2);
		ArrayList<String> list3=new ArrayList<String>(list1);
		list3.retainAll(list2);
		System.out.println("Common Strings between two lists :"+list3);
		ArrayList<String> list4=new ArrayList<String>();
		list4.addAll(list3);
		System.out.println("LIST 3: "+list4);
	}
}