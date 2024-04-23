class Occurence{
	public static void main(String[] args){
		int [] arr  = {1,2,3,3,4,5,6,7,7,8,8,9};
		int occurence = 3;
	    int repeat =0;
		for(int i=0;i<arr.length;i++){
			if(occurence==arr[i]){
				repeat=repeat+1;
				//System.out.println("the occurence is ");
			}
		}
		System.out.print("the occurence is "+repeat); 
	}
}