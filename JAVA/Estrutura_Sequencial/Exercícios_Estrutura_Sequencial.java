package com.Exercicios;

import java.util.Scanner;

/* Enunciado: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa */

public class Exercícios_Estrutura_Sequencial {

	public static void main(String[] args) {
		
		int y ;
		int x;
		int w;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: " );
		y = leia.nextInt();
		
		System.out.println("Entre com o segundo número inteiro: " );
		x = leia.nextInt();
		
		w = (y + x);
		
		System.out.println("A soma dos dois números acima foi de: " + w);

	}

}
