class Rectangle2 implements Shape{
	int length;
	int breadth;
	
	public static void main(String[]args){
		Rectangle2 obj1=new Rectangle2();
		obj1.length = 20;
		obj1.breadth = 10;
		System.out.println("area ="+obj1.getArea());
	}
    public double getArea(){
		return length* breadth;
		
	}
}