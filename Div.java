import java.util.*;

public class Div{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("NUMBER : ");
		int number=scan.nextInt();
		if(number%5==0){
			System.out.println("the number is  divisible by 5 ");
		}
		else{
			System.out.println("the number is not divisible by 5");
		} 
			if(number%11==0){
			System.out.println("the number is  divisible by 11 ");
			}
			else{
				System.out.println("the number is not divisible by 11");
			}
	}
}