package pacoteLacosDecisao2;

import java.util.Scanner;

public class exibirNumeroImpar4 
{

	public static void main(String[] args) 
	{
		double num, raiz, pot;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("\nDigite um numero: ");
		num = ler.nextDouble();
		
		
		if(num % 2 == 0)
		{
			 raiz = Math.sqrt(num);
			 
			 System.out.printf("\n===========================================================");
			 System.out.printf("\nO numero digitado � par e sua raiz quadrada � %.2f" , raiz );
			 System.out.printf("\n===========================================================");
		}
		else
		{
			pot = Math.pow(num, 2);
			
			System.out.printf("\n===========================================================");
			System.out.printf("\nO numero digitado � �mpar e a potencia do mesmo �  %.2f" , pot );
			System.out.printf("\n===========================================================");
		}

	}

}
