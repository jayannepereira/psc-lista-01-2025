import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     System.out.println("Escreva seu nome: ");
     
     Scanner scanner = new Scanner(System.in);
     String nome = scanner.nextLine();
     
     System.out.println("Olá, " + nome);
  }
}
