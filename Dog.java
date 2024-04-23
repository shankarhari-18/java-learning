class Dog{
	public static void main(String[] args){
	Dog obj=new Dog();
	Dog obj1=new Dog("puppy");
	Dog obj3=new Dog();
	Dog obj4=new Dog("german shephard");
	
	
	System.out.println(obj.name);
	System.out.println(obj1.name);
	System.out.println(obj3.name);
	System.out.println(obj4.name);
	
	}
	public Dog(){
		
	}
	String name = "jimmy";
	public Dog(String x){
	name=x;
	}
class Breed{	
	public Breed(){
		
	}
	String name = "dommy";
	public Breed(String y){
		name=y;
	}
}
}
