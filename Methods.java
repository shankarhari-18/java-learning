class Methods{
	public static void main(String[] args){
		long num1 = 200;
		long num2 = 300;
		Methods obj= new Methods();
		obj.sample();
		String result = obj.retunType();
		System.out.println(result);
		obj.addtion(10,20);
		obj.addtion(20,30);
		obj.addtion(30,40);
		obj.addtion(40,50,60);
		System.out.println(obj.hello("Hello world"));
		obj.addtion(num1,num2);
		obj.naturalNumber(10);
	}
	public static void main(int[] args){
		System.out.println("main method overloading");
	}
	void sample(){
		System.out.println("Sample method is called.");
	}
	
	String retunType(){
		
		return "Return method is called";
	}
	
	void addtion(int x, int y){
		int add = x+y;
		System.out.println("Addtion of "+x+" and "+y+" is " + add);
	}
	
	void addtion(long x, long y){
		System.out.println("Long method is excuted.");
		long add = x+y;
		System.out.println("Addtion of "+x+" and "+y+" is " + add);
	}
	
	void addtion(int x, int y,int z){
		int add = x+y+z;
		System.out.println("Addtion of "+x+" and "+y+ " and "+z+" is " + add);
	}
	
	String hello(String x){
		return x;
	}
	
	int naturalNumber(int x){
		Methods obf = new Methods();
		
		
		if(x<0){
			
			return x;
		}
		System.out.println(x);
		return obf.naturalNumber(x-1);
	}
}