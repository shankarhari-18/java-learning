import java.util.*;

public class Range{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.print("MARK:");
		int grade=scan.nextInt();
		if(grade>90){
			System.out.println("GRADE 1");
		}
		else if(grade>=80){
			System.out.println("GRADE 2");
		}
		else if(grade>=70){
			System.out.println("GRADE 3");
		}
		else if(grade<=50){
			System.out.println("GRADE 4");
		}
	}
} 