import java.util.*;

public class Scann{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list1=new ArrayList<String>();
		
		for (int x= 0; x<5;x++){
			System.out.print("Element "+(x+1)+":");
			list1.add(scan.next());
		}
		System.out.println("Before removing duplicates: "+list1);
		list1.remove(3);
		System.out.println("After removing duplicates : "+list1);
	}
}
