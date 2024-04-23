import java.util.*;

public class Leap2{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("YEAR :");
		int year=scan.nextInt();
		if(year%4==0){
			if(year%100==0)
				if(year%400==0)
					System.out.println("it is leap year");
		}
		else{
			System.out.println("it is not a leap year");
		}
	}
}