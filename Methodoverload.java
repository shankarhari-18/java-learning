class Methodoverload{
	public static void main(String[] args){
		Methodoverload obj=new Methodoverload();
		int plus[]={12,12,12,12,12};
		obj.addition(5,5);
		obj.addition(35,5,5);
		obj.subtraction(5,5);
		obj.subtraction(10,15,30);
		obj.multiplication(356,434,567,6123);
		obj.add(12.5,1.2);
		String result=obj.print();
		System.out.println(result);
	    obj.sum(12);
		int add=obj.sum(12,12,12,12);
		System.out.println("the sum of all the return value is "+add);
		int Result = obj.sumOfArray(plus);
		System.out.println("Sum of array is "+Result);
}
	void addition(int a,int b){
		int add=a+b;
	System.out.println("the value of a and b is ="+add);
	}
	void addition(int a,int b,int c){
		int add=a+b+c;
	System.out.println("the value of "+a+" and "+b+" and "+c+" is =" +add);
	}
	void subtraction(int x,int y){
		int sub=x-y;
	System.out.println("the subtraction of " +x+ " and "+y+" is = "+sub); 
	}
	void subtraction(int x,int y,int z){
		int sub=x-y-z;
	System.out.println("the subtraction of " +x+ " minus "+y+" minus "+z+" is = " +sub);
	}
	void multiplication(int a,int b,int c,int d){
	    int mul=a*b*c*d;
	System.out.println("the value of a and b and c and d is = "+mul);
	}
	void add(double x,double y){
		double addition=x+y;
		System.out.println("the double addition of x and y is = "+addition);
	}
	String print(){
		return"the print statement in return";
	}
	void sum(int n1){
	int add=n1+1;
	System.out.println("the sum of all the array is " +add);
	}
	int sum(int x1,int x2,int x3,int x4){
		return x1+x2+x3+x4;
	}
	
	int sumOfArray(int[] x){
		int sum =0;
		for(int i:x){
			sum = sum + i;
		}
		return sum;
	}
}


	