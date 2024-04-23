import java.util.*;

public class Immutable{
	public static void main(String[]args){
		Set<String> str=new HashSet<String>();
		str.add("lion");
		str.add("tiger");
		str.add("monkey");
		str.add("cheetah");
		HashSet<String> st=Set.copyOf(str);
		System.out.println(st);
	}
}