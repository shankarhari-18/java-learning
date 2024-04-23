class MultiArray{
	public static void main(String [] a){
		int[] ary= {1,2,3,4,5,6};
		
		int[] myAry = new int[10];
		myAry[0]=20;
		System.out.println("myAry ="+myAry[0]);
		
		int[][] multiAry = {{1,2},{3,4},{5,6}};
		
		int[][] myMultiAry = new int[5][2];
		myMultiAry[0][0]= 100;
		System.out.println("myMultiAry ="+myMultiAry[0][0]);
		
		
		
		for(int x:ary){
			System.out.println("one- dementional array "+x);
		}
		
		for(int[] x:multiAry){
			for(int y:x){
                System.out.println("two- dementional array "+y);
			}
		}
	}
}