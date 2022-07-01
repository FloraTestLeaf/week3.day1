package week3.day1.Bank;

public class AxisBank extends BankInfo {
	
	
	private int deposit() {
	// TODO Auto-generated method stub
		int amount=98999;
        System.out.println("deposit it");
        return amount;
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank ax=new AxisBank();
int depo=ax.deposit();
System.out.println(depo);
	}

}
