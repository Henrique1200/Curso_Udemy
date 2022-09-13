package com.Exercicios;

import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)*/

public class Exercicio3 {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		int D;
		int dif; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		A = leia.nextInt();
		
		System.out.println("Entre com o segundo número inteiro: ");
		B = leia.nextInt();
		
		System.out.println("Entre com o terceiro número inteiro: ");
		C = leia.nextInt();
		
		System.out.println("Entre com o quarto número inteiro: ");
		D = leia.nextInt();
		
		  dif = A * B - C * D;

		    System.out.println("DIFERENçA = " + dif);	
			
			
	}

}
