import java.util.*;

public class Set_map{
	public static void main(String[]args){
		HashMap<Integer,String> has1=new HashMap<Integer,String>();
		has1.put(1,"white");
		has1.put(2,"orange");
		has1.put(3,"blue");
		has1.put(4,"red");
		Set keySet = has1.keySet();
		System.out.print("keySet values are  : "+keySet);
	}
}