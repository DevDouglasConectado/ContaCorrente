package contacorrente2;

public class teste02 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
	    conta.numero = "123456";
	    conta.agenca = "1234";
	    conta.especial = true;
	    conta.limiteEspecial = 500;
	    conta.valorEspecialUsado = 0;
	    conta.saldo = -10;
		 
		boolean saqueEfetuado = conta.realizarSaque(10);
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso ");
           conta.consultarSaldo();
			 
		}else {
			System.out.println("Não possivel realizar saque");

		}
		 saqueEfetuado = conta.realizarSaque(500);
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso ");
          conta.consultarSaldo();
			 
		}else {
			System.out.println("Não possivel realizar saque");

		}	
		System.out.println("Deposito de 500 reais ");
		conta.depositar(500);
         conta.consultarSaldo();
         
         if (conta.verificarUsoChequeEspecial()) {
        	 System.out.println("Esa usadoo cheque especial");
         }else {
        	 System.out.println("não esta usando cheque especial");
         }
         
         conta.realizarSaque(1000000);
         conta.consultarSaldo();
         if (conta.verificarUsoChequeEspecial()) {
        	 System.out.println("Esa usadoo cheque especial");
         }else {
        	 System.out.println("não esta usando cheque especial");
         }
	}

}
