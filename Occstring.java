class Occstring{
	public static void main(String[]args){
		//declare a string
		String input="apple";
		System.out.println("The given string is : "+input);
		int count=0;
		//use for loop to know the length of thr str
	    for(int i=0;i<input.length();i++){
		  if(input.charAt(i)=='p'){
			count++;
		  }
		}
		System.out.println("the occurence of given char is :"+count);
	}
}