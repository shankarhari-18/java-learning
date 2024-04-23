class Multi{
	public static void main(String[]args){
		Multi obj=new Multi();
		int[][] arr ={{1,2},{2,2},{2,3}};
		int result = obj.sumarr (arr);
		System.out.println("the sum of multi array = "+result);
	}
	
	int sumarr(int[][]x){
		int add=0;
		for(int[] i:x){
			for(int y:i){
				add=add+y;
			}
		}
		return add;
	}
}

	
 