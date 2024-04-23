class Vehicle{
	String name;
	String color;
	public void vehicleName(){
    System.out.println(name);
	}
}
class Car extends Vehicle{
	public static void main(String[]args){
		Car obj = new Car();
		obj.name="bullet";
		obj.color="red";
		obj.vehicleName();
	}
}
	