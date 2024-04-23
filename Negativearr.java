class Negativearr{
	
	int num;
	int num2;
	int num3;
	int num4;
	int num5;
	
	
	public Negativearr(){}
	
	public Negativearr(int x){
		num=x;
	}
	public Negativearr(int x,int y,int z,int a){
	    num=x;
		num2=y;
		num3=z;
		num4=z;
		num5=a;
	}
	

	
	public static void main(String[] args){
		Negativearr obj = new Negativearr(12,13,16,17);
		Negativearr obj1 = new Negativearr(13);
		Negativearr obj2 = new Negativearr(14);
		Negativearr obj3 = new Negativearr(15);
		Sample obj4 = new Sample();
		Sample obj5 = new Sample("shankar");
		Sample obj7 = new Sample();
		Sample shankar=new Sample(10);
		Sample shankar2=new Sample(15.00);
		System.out.println(obj.num);
		System.out.println(obj.num2);
		System.out.println(obj.num3);
		System.out.println(obj.num4);
		System.out.println(obj.num5);
		System.out.println(obj5.name);
		System.out.println(obj7.name);
		System.out.println(shankar.num7);
		System.out.println(shankar2.num1);
	}
}

class Sample{
	
	String name = "Hari";
	public Sample(String x){
		name=x;
	}
	int num;
	public Sample(){
	}
	int num7;
	public Sample(int x){
		num7=x;
	}
	double num1;
	public Sample(double y){
		num1=y;
	}
	
	
}
