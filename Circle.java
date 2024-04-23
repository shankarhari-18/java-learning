class Circle{
	public static void main(String[]args){
	Circle obj=new Circle();
	obj.areaOfCircle(20);
	obj.circumferenceOfCircle(20);
	}
	
	void areaOfCircle(int radius){
		double area=3.14*radius*radius;
		System.out.println("the area of the circle is = "+area);
	}
	
	void circumferenceOfCircle(int radius){
		float circumference = (float)(2*3.14*radius);
		System.out.print("the circumference of the circle is = "+circumference);
	}
	

}