class Occ2{
	public static void main(String[]args){
		//declare a string
		String input1="apple";
		System.out.println("the given string is :"+input1);
		//count starting from 0
		int count=0;
		for(int i=0;i<input1.length();i++){
			if(input1.charAt(i)=='p'){
				count++;
			}
		}
		System.out.println("the occurence of given char 'p' is:"+count);
	}
}
				