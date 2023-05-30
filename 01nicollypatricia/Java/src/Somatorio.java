import java.util.Scanner;

public class Somatorio {
	
		public void somatorio() {
		Scanner num = new Scanner (System.in);
		int num1;
		int num2;
		int soma;
		
		System.out.print("Informe o primeiro valor: ");
		num1 = num.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		num2 = num.nextInt();
		
		soma = num1 + num2;
		
		System.out.print("A soma dos valores informados eh igual a: " + soma);

    num.close();
		}
	} 

