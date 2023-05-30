import java.util.Scanner;
public class Primo {

		public void primo() {
			Scanner scan = new Scanner(System.in);
			int num;
			int numDivisores=0;
			
			System.out.print("Informe um número: ");
			num = scan.nextInt();
			
			for(int i=1; i<=num; i++) {
				if(num % i == 0) {
					numDivisores++;
					}
				}
			if(numDivisores == 2) {
				System.out.print("O numero eh primo");
				} else {
				System.out.print("O numero não eh primo");
				}
							scan.close();
		}
		}

