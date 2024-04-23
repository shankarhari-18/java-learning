class Rectanglemethod{
	public static void main(String[] args){
		Rectanglemethod obj= new Rectanglemethod();
		obj.rectangle(10,20);
		obj.rectangle(20,20);
		int result=obj.returntype(10,30);
		int rectangle=obj.returntype(1,1);
		System.out.println("the area of rectangle in return type is = "+result);
		System.out.println("the area of rectangle in return type is = "+rectangle);
	}
	void rectangle(int l,int b){
		int  mul=l*b;
		System.out.println("The area of rectangle is ="+mul);
	}
	int returntype(int l,int b){
		return l*b;
	}
		
      	
}	
		
		
	