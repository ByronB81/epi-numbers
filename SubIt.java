import java.io.Console;

public class SubIt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Pick a number");
    String strNum1 = myConsole.readLine();
    System.out.println("Interesting... interesting...");
    System.out.println("Okay now pick another one. Then I'll subtract it from the first!");
    String strNum2 = myConsole.readLine();

    Integer num1 = Integer.parseInt(strNum1);
    Integer num2 = Integer.parseInt(strNum2);
    Integer sub = num1 - num2;
    String total = Integer.toString(sub);

    System.out.println("Okay, you chose " + strNum1 + " and " + strNum2);
    System.out.println("I guess added together that would be... hmm...");
    System.out.println(total);
  }
}
