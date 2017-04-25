import java.io.Console;

public class Encrypt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a phrase");
    String dirty = myConsole.readLine();
    String rinse1 = dirty.replaceAll("e", "3");
    String rinse2 = rinse1.replaceAll("l", "1");
    String rinse3 = rinse2.replaceAll("s","5");
    String rinse4 = rinse3.replaceAll("o","0");


    System.out.println(rinse4);

  }
}
