import java.util.*;

public class Removearr{
	public static void  main(String[]args){
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList <Integer>();
		for(int i=0;i<5;i++){
		System.out.print("numbers "+(i+1)+ ":");
		list1.add(scan.nextInt());
		}
		System.out.println("numbers : "+list1);
		for(Integer element:list1){
			if(list1.contains(element)){
				System.out.println("list"+element);
			}
			 ArrayList<Integer> list2 = removeDuplicates(elements);
			 System.out.println("duplicate removes"+list2);
		}
	}
}