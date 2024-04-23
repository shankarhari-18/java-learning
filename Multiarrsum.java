class Multiarrsum{
	public static void main(String[]args){
		Multiarrsum obj=new Multiarrsum();
		int[][] multiarr={{1,2},{2,3},{3,4}};
		int result = obj.sumarr(multiarr);
		System.out.print("the sum of multidimensional array"+result);
	}
	
	int sumarr(int[][] x){
		int add=0;
		for(int[] i:x){
			for(int y:i){
				add=add+y;
			}
			
		}
	return add;
	}
}
		