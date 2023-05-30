import java.util.Scanner;
public class Contagem {
    public void contagem() {
    Scanner scanner = new Scanner(System.in);
  
    int primeiroValor;
    int n;
  
    System.out.print("Digite o primeiro valor: ");
    primeiroValor = scanner.nextInt();
  
    System.out.print("Digite o valor do último número: ");
    n = scanner.nextInt();
    scanner.close();
    int contador = 0;
    for (int i = primeiroValor; i <= n; i++) {
        if (i % 1 == 0) {
            contador++;
        }
      }
      
      System.out.println("Existem " + contador + " valores inteiros entre " + primeiroValor + " e " + n + ".");
    }
      
    }


