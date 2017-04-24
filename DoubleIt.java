import java.io.Console;

public class DoubleIt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How many troops did you bring?");
    String stringNumber = myConsole.readLine();

    Integer num = Integer.parseInt(stringNumber);
    Integer newNum = num * 2;

    String stringDouble = Integer.toString(newNum);
    System.out.println("Haha I brought " + stringDouble + "!");
    System.out.println("I WIN!!!");

  }
}
