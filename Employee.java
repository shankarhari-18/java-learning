class Employee{
	String name="hari";
	String jobtitle="customer service associate";
	int salary;
	public Employee(String x,String y){
		 name=x;
		jobtitle=y;
	}
	public Employee(){	
	}
	public Employee(int x){
		salary=x;
	}
	public static void main(String[] args){
		Employee obj1=new Employee("shankar","customer service associate");
		Employee obj2=new Employee();
		Employee obj3=new Employee(25000);
		System.out.println("name : "+obj1.name);
		System.out.println(obj2.jobtitle);
		System.out.println(obj3.salary);
		
	}
	
	
}