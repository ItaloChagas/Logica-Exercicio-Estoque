package exec1.ct;

import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entrada =0;
		int tentativa =0;

		do {
			if(tentativa >=3) {
				System.out.println("N�mero de tentativas excedido");
				entrada =9;
			}else {
				System.out.println("Informar um numero entra 1 e 9.");
				entrada = sc.nextInt();
				tentativa +=1;
			}

		}while (entrada <= 0 || entrada >=10);

		if(tentativa >=3) {
			System.out.println("saindo...");
		}else {
				
			multiplicacao(entrada);
		}

	}
	
	public static void multiplicacao(int num) {
		
		for(int i =1; i <=num; i++) {
			System.out.println(" ");
			for(int j =1; j <= i;j++) {
				System.out.print(i*j + " ");
			}
		}
		
	}

}