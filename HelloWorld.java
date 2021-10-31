import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name below : ");
    System.out.println("Hello : "+ scanner.nextLine());
  }
}
