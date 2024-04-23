class Employee_de{
	public static void main(String[] args){
		Details obj=new Details();
		obj.setemployee_name("shankar");
		obj.setemployee_id("HrH20790");
		obj.setemployee_salary(30000.12);
		
		System.out.println("employee_name : "+obj.getemployee_name());
		System.out.println("employee_id : "+obj.getemployee_id());
		System.out.println("employee_salary : "+obj.getemployee_salary());		
	}
}

class Details{
	private String employee_name;
	private String employee_id;
	private double employee_salary;
	//setters and getters
	public void setemployee_name(String x){
		employee_name=x;
	}
	public String getemployee_name(){
		return employee_name;
	}
    public void setemployee_id(String y){
		employee_id=y;
	}
	public String getemployee_id(){
		return employee_id;
	}
	public void setemployee_salary(double z){
		employee_salary=z;
	}
	public double getemployee_salary(){
		return employee_salary;
	}
}
	