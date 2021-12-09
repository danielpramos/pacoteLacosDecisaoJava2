package pacoteLacosDecisao2;

import java.util.Scanner;

public class classificacaoIdade3 
{

	public static void main(String[] args) 
	{
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("\nDigite a sua idade: ");
		idade = ler.nextInt();
	
		
		if(idade >= 10 && idade <=14 )
		{
			System.out.printf("\n==============================================");
			System.out.printf("\nVocê é da categoria infantil");
			System.out.printf("\n==============================================\n");
		}
		else if(idade > 14 && idade <= 17)
		{
			System.out.printf("\n==============================================");
			System.out.printf("\nVocê é da categoria juvenil");
			System.out.printf("\n==============================================");
		}
		else if(idade > 17 && idade <= 25)
		{
			System.out.printf("\n==============================================");
			System.out.printf("\nVocê é da categoria adulto");
			System.out.printf("\n==============================================");
		}
		else
		{
			System.out.printf("\n==============================================");
			System.out.printf("\nNão tem categoria pra idade digitada");
			System.out.printf("\n==============================================");
		}

	}

}
