class Arrayadd{
	public static void main(String[] args){
		//enter the string for add using stringbuilder
		String[] strarr={"hello","welcome","to","java world"};
		//create obj for stringbuilder
		StringBuilder str1=new StringBuilder();
		for (String str:strarr){
			str1.append(str);
		}
		System.out.println("add the string using stringbuilder : "+str1);
	}
}