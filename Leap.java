class Leap{
	public static void main(String[] args){
		int year = 2024;
		if(year%4==0)
			System.out.println("this is a leap year "+year);
		if(year%100==0)
			System.out.println("this is a leap year "+year);
		if(year%400==0)
			System.out.println("this is a leap year "+year);
		else
			System.out.println("this is not a leap year "+year);
	}
}