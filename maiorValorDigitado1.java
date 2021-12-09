package pacoteLacosDecisao2;

import java.util.Scanner;

public class maiorValorDigitado1 
{

	public static void main(String[] args) 
	{
		int valor1, valor2, valor3, maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("\nDigite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.printf("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		System.out.printf("Digite o terceiro valor: ");
		valor3 = ler.nextInt();
		
		while(valor1 == valor2 || valor2 == valor3 || valor3 == valor1)
		{
			System.out.println("\nMais de um valor igual não é permitido, digite novamente ");
			
			System.out.printf("\nDigite o primeiro valor: ");
			valor1 = ler.nextInt();
			System.out.printf("Digite o segundo valor: ");
			valor2 = ler.nextInt();
			System.out.printf("Digite o terceiro valor: ");
			valor3 = ler.nextInt();
		}
		
		if(valor1 > valor2 && valor1 > valor3)
		{
			System.out.printf("\nO maior valor digitado é " + valor1);
		}
		else if(valor2 > valor3 && valor2 > valor1)
		{
			System.out.printf("\nO maior valor digitado é " + valor2);
		}
		else if(valor3 > valor1 && valor3 > valor2)
		{	
			System.out.println("\n==================================");
			System.out.printf("O maior valor digitado é " + valor3);
			System.out.println("\n==================================");
		}
	}

}
