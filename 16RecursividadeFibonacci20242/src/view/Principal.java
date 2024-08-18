package view;

import java.util.Scanner;

import controller.SerieFibonacci;

public class Principal {

	public static void main(String[] args) {
		SerieFibonacci fib = new SerieFibonacci();
		int n = 0;
		Scanner entrada = new Scanner(System.in);
		while(n <= 0 || n >20) {
			System.out.println("Digite o número de série fibonacci desejada: ");
			n = entrada.nextInt();
		}
		int resposta = fib.serieFibonacci(n);
		System.out.println(resposta);
		entrada.close();
	}

}
