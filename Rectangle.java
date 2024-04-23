class Rectangle{
	public static void main(String[]args){
		Rectangle obj=new Rectangle();
		obj.area(30,20);
		obj.perimeter(30,20);
		
	}
	void area(int height,int width){
		int mul=height*width;
		System.out.println("the area of the rectangle is ="+mul);
	}
	void perimeter(int height,int width){
		int add=2*(height+width);
		System.out.println("the perimeter of the rectangle is ="+add);
	}
	

		
}