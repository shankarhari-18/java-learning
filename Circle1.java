class Circle1 implements Shape{
	double radius;
	
	public static void main(String[] args){
		Circle1 obj=new Circle1();
		obj.radius =22;
		System.out.println(obj.getArea());
	}
	public double getArea(){
		return 3.14*22*22;
	}
}