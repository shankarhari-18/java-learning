class Truck extends Car{
	 public String model;
	public static void main(String[] args){
	Truck obj=new Truck();
	obj.name="benz";
	obj.color="blue";
	obj.model="bs6";
	obj.wheel="six wheels";
	//obj.vehicleName();
	obj.forward();
	}
	/*void vehicleName(){
	System.out.println("name= "+obj.name );
	System.out.println("color= "+obj.color);
	System.out.println("model= "+obj.model);
	System.out.println("wheel= "+obj.wheel);
	}*/
	
	public void forward(){
		System.out.println("Speed = 50Km/h");
	}
}

