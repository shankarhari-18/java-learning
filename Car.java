
public class Car extends Vehicle{
	public String wheel;
	/*public static void main(String[] args){
		Car obj = new Car();
		obj.name="bullet";
		obj.color="red";
		obj.vehicleName();
	}*/
}
	
class Vehicle{
	public String name;
	public String color;
	
	public void vehicleName(){
    System.out.println(name);
    System.out.println(color);
	}
	
	public void forward(){
		System.out.println("Speed = 10Km/h.");
	}
}


	
	