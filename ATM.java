import java.util.Scanner;

class BankAccount{
	private double bal;
	public BankAccount(double initBal) {
		bal = initBal;
	}
	public void deposit(double amount) {
		if(amount>0) {
			bal = bal + amount;
			System.out.println("Deposited Rs." + amount);
		}
		else{
			System.out.println("Invalid Deposit Amount");
		}	
	}
	public void withdraw(double amount) {
		if(amount<=bal && amount>0) {
			bal = bal - amount;
		}
		else if(amount<=0){
			System.out.println("invalid withdrawal amount");
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	public void checkBalance(){
		System.out.printf("current balance: Rs.%.2f\n",bal);
	}
}
public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount user = new BankAccount(1000);
		int choice = 0;
		
		while(choice!=4) {
			System.out.println("enter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				user.checkBalance();
				break;
			case 2:
				System.out.println("enter amount to deposit: ");
				double deposit = sc.nextDouble();
				user.deposit(deposit);
				break;
			case 3:
				System.out.println("enter amount to withdraw: ");
				double withdraw = sc.nextDouble();
				user.withdraw(withdraw);
				break;
			case 4:
				System.out.println("thank you for visiting");
				break;
			default:
				System.out.println("please enter a valid choice");
			}
		}
		sc.close();
	}
}
