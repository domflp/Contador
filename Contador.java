package desafio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);

		System.out.println("Insira o primeiro numero ");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Insira o Segundo numero ");
		int parametroDois = terminal.nextInt();
 
		try {
 
			contar(parametroUm, parametroDois);
 
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
 
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
    throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
  }
 
		int contagem = parametroDois - parametroUm;
 
		for (int i = 0; i < contagem; ++i) {
		  System.out.printf("Imprimindo o numero %d%n", i);
		}
 
	}
	
 public static class ParametrosInvalidosException extends Exception {

  public ParametrosInvalidosException(String message) {
    super(message);
  }
}
}