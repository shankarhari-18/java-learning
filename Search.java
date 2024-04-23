import java.util.ArrayList;

public class Search{
	public static void main(String[]args){
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("blue");
		arr.add("green");
		arr.add("yellow");
		arr.add("white");
		System.out.println("given colors: "+arr);
		
		
		System.out.println(arr.contains("violet")? "found the color":"not found the color");
	}
}