package banco;

public class Conta {
	private double balance = 0;
	private final int number;

	
	public Conta( double balance, int number){
		this.balance = balance;
		this.number = number;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public int getNumber(){
		return this.number;
	}
}
