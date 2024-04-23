class Digit{
	public static void main(String[] args){
		long number = 8220764893L;
		int count = 0;
		while (number !=0){
			number /=10;
			count++;
		}
		System.out.print("Number of digits in:"+count);
	}
}