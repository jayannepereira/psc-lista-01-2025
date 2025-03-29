import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      
     System.out.println("Escreva seu nome: ");
     String nome = scanner.next();
     
     System.out.println("Escreva sua idade: ");
     int idade = scanner.nextInt();
     
     System.out.println("Escreva sua altura: ");
     float altura = scanner.nextFloat();
     
     System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e " + altura + "m de altura.");
  }
}