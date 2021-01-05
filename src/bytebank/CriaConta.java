package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);
        
        Conta terceiraConta = new Conta();
        terceiraConta.saldo = 100;
        System.out.println(terceiraConta.saldo);
			
		

	}

}
