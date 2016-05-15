package banco;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta(1000, 12345);
		System.out.println( c.getBalance() );
		System.out.println( c.getNumber() );
	}

}
