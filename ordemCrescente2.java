package pacoteLacosDecisao2;

import java.util.Scanner;

public class ordemCrescente2 
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
		
		while(valor1 == valor2 || valor1 == valor3 || valor2 == valor3)
		{
			System.out.printf("\nValores iguais não são inválidos, por favor digite novamente \n");
			System.out.printf("\nDigite o primeiro valor: ");
			valor1 = ler.nextInt();
			System.out.printf("Digite o segundo valor: ");
			valor2 = ler.nextInt();
			System.out.printf("Digite o terceiro valor: ");
			valor3 = ler.nextInt();
			
		}

		if(valor1 < valor2 && valor1 < valor3)
		{
			if(valor2 < valor3)
			{
				System.out.println("\n=======================================================");
				System.out.println("A ordem crescente é "+valor1+", " +valor2+", " +valor3);
				System.out.println("=======================================================");
			}
			else 
			{
				System.out.println("\n=======================================================");
				System.out.println("A ordem crescente é "+valor1+", " +valor3+", " +valor2);
				System.out.println("=======================================================");
			}		
		}
		else if(valor2 < valor3 && valor2 < valor1)
		{
			if(valor3 < valor1)
			{
				System.out.println("\n=======================================================");
				System.out.println("A ordem crescente é "+valor2+", " +valor3+", " +valor1);
				System.out.println("=======================================================");
			}
			else
			{
				System.out.println("\n=======================================================");
				System.out.println("A ordem crescente é "+valor2+", " +valor1+", " +valor3);
				System.out.println("=======================================================");
			}
		}
		else if(valor3 < valor1 && valor3 < valor2)
		{
			if(valor1 < valor2)
			{
				System.out.println("\n=======================================================");
				System.out.println("A ordem crescente é "+valor3+", " +valor1+", " +valor2);
				System.out.println("=======================================================");
			}
			else
			{
				System.out.println("\n=======================================================");
				System.out.println("A ordem crescente é "+valor3+", " +valor2+", " +valor1);
				System.out.println("=======================================================");
			}
		}
	}
}
