package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	// método principal
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int numero1 = teclado.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int numero2= teclado.nextInt();
		
		int soma = soma(numero1, numero2);
		int subtracao = subtracao(numero1, numero2);
		double divisao = (double) divisao(numero1, numero2);
		int multiplicacao = multiplicacao(numero1, numero2);
		
		
		System.out.println("A soma dos números informados é " + soma);
		System.out.println("A subtração dos números informados é " + subtracao);
		System.out.println("A divisão dos números informados é " + divisao);
		System.out.println("A multiplicação dos números informados é " + multiplicacao);
	}
	
	//outros métodos.
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public static int subtracao(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	public static int multiplicacao(int numero1, int numero2) {
		return numero1 * numero2;
	}

}
