import java.io.Console;

public class Encrypt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a phrase");
    String dirty = myConsole.readLine();
    String rinse1 = dirty.replaceAll("e", "3");
    String rinse2 = rinse1.replaceAll("i", "1");
    String rinse3 = rinse2.replaceAll("s","5");
    String rinse4 = rinse3.replaceAll("o","0");
    String rinse5 = rinse4.replaceAll("b","6");
    String rinse6 = rinse5.replaceAll("g","9");
    String clean = rinse5.replaceAll("l","7");

    System.out.println();
    System.out.println("...encrypting...");
    System.out.println();
    System.out.println(clean);

  }
}
