class Constructor{
	String name="shankar";
	int age=18;
	double salary;

	
public Constructor(String x){
	name=x;
}
public Constructor(int y){
	age=y;
}
public Constructor(double z){
	salary=z;
}

public static void main (String[] args){
	Constructor obj1=new Constructor("hari");
	Constructor obj2=new Constructor(21);
	Constructor obj3=new Constructor(25000.12);
	
	System.out.println("name :"+obj1.name);
	System.out.println("age :"+obj2.age);
	System.out.println("salary :"+obj3.salary);
}
}
	