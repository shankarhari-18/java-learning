class Buff{
	public static void main(String[]args){
		//enter thee string to add using strbuffer 
		String[] str={"welcome"," ","to"," ","java"," ","world"};
		//create a obj for strbuffer
		StringBuffer str1=new StringBuffer();
		for (String str2:str){
			str1.append(str2);
		}
		System.out.println("add the array of string using string buffer is :"+str1); 
	} 
}