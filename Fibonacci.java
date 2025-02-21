import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite uma posição da sequencia de fibonnaci (limite 20): ");
      int posFibo = sc.nextInt();
      if (posFibo > 20) {
         throw new Error("Limite de 20 excedido");
      }
      int result = ArrayFibo(posFibo);
      System.out.println("O termo na posição " + posFibo + " corresponde ao valor:" + result);
   }

   public static int ArrayFibo(int posFibo) {
      if (posFibo <= 1) {
         return 1;
      } else {
         return ArrayFibo(posFibo - 1) + ArrayFibo(posFibo - 2);
      }
   }
}
