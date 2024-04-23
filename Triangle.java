class Triangle implements Shape{
	int breadth;
	int height;
	
	public static void main(String[] args){
		Triangle obj=new Triangle();
		obj.breadth = 10;
		obj.height = 10;
		System.out.println("area of triangle = "+obj.getArea());
	}
	public double getArea(){
		return 0.5*breadth*height;
	}

}