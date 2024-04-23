class BankAccount{
	public static void main(String[]args){
		Account obj=new Account();
		obj.setaccountNumber(13371);
		obj.setbalance(13000);
		System.out.println(obj.getaccountNumber());
		System.out.println(obj.getbalance());
	}
}
class Account{
	private  int accountNumber;
	private int balance;
    //getters and setters
    public void setaccountNumber(int x){
	accountNumber=x;
	}
	
    public int getaccountNumber(){
		return accountNumber;
	}
    public void setbalance(int y){
		balance=y;
	}
	public int getbalance(){
		return balance;
	}
}



	


	
