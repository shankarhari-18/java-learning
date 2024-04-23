class Reverse{
	public static void main(String[] args){
		int n1=123456789;
		int num = 0;
		for( int n2=0;n1>n2; ){
		   int remainder=n1%10;
		   num=num*10+remainder;
		   n1=n1/10;
		   System.out.print("reverse num is "+ num);
		}
	}
}
		
	