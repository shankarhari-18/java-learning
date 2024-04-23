import java.util.*;

public class Eveodd{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=scan.nextInt();
		if(num%2==0){
			System.out.println("the given number is even number");
		}
		else{
			System.out.println("the given number is odd number");
		}
	}
}