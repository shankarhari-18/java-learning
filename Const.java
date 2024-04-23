class Const{
	public static void main(String[] args){
		Const shankar2=new Const(200);
		Const hari=new Const();
		System.out.println(shankar2.num);
		System.out.println(hari.num);
	}
	int num;
	public Const(int x){
		num=x;
	}
	public Const(){}
}