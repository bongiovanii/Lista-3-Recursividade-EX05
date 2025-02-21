import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite uma posição da sequencia de fibonnaci (limite 20): ");
      int posFibo = sc.nextInt();
      if (posFibo > 20) {
         throw new Error("Limite de 20 excedido");
      }
      int result = getArrayFibo(posFibo);
      System.out.println("O termo na posição " + posFibo + " corresponde ao valor:" + result);
   }

   public static int getArrayFibo(int posFibo) {
      if (posFibo <= 1) {
         return 1;
      } else {
         return getArrayFibo(posFibo - 1) + getArrayFibo(posFibo - 2);
      }
   }
}
