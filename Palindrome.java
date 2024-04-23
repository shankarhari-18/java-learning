class Palindrome{
	public static void main(String[]args){
		String input="repaper";
		System.out.println("The given string is :"+input);
		//create object to enter the input value in args
		StringBuilder input1=new StringBuilder(input);
		//reverse the given string
		input1.reverse();
		if(input.equals(input1)){
			System.out.println("The given string is palindrome :");
		}else{
			System.out.println("The given string is not a palindrome :");
		}
	}
	
}