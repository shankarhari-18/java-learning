class Overload{
	public static void main(String[] args){
		Overload obj=new Overload();
		obj.addition(10,10);
		obj.add(12.2,12.2,12.2);
		obj.sub(10.2,10.2);
		long result=obj.plus(150,150,150,150);
		System.out.println("the addition using return method is " +result);
		obj.str("");
		String res=obj.bike("");
		System.out.println("the types of bike names :"+res);
		
	}
	void addition(int x,int y){
		int add=x+y;
		System.out.println("the addition value of x and y is =" +add);
	}
	void add(double x,double y,double z){
		double plus=x+y+z;
		System.out.println("the addition value of x and y and z is = " +plus); 
	}
	void sub(double a,double b){
		double subtract=a-b;
		System.out.println(" subtract value of a-b is =" + subtract);
	}
	long plus(long x,long y,long z,long a){
	return x+y+z+a;
	}
	void str(String x){
		String name="shankar";
		System.out.println("the name of the string is :"+name);
	}
	String bike(String x){
		return "rx100";
	}
}