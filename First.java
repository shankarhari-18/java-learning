class First{
	public static void main(String[] args){
		System.out.println("Hello world");
		First obj = new First();
		obj.sample();
		//String result = obj.test();
		System.out.println(obj.test());
		obj.addition(50,40);
		int sub = obj.subtraction(30,15);
		System.out.println("subtraction of x minus y is "+sub);
		//obj.multiple(2,1);
		System.out.println("multiple of x and y is " +obj.multiple(2,1));
	}
	
	void sample(){
		System.out.println("Its a void method");
	}
	
	String test(){
		return "Its a return type method.";
	}
	
	void addition(int x, int y){
		int z = x+y;
		System.out.println("Addtion of x and y is " + z);
	}
	int subtraction(int x,int y){
		int z=x-y;
		return z;
	}
	int multiple(int x,int y){
	int z=x*y;
	return z;
	}
	
}

	