import java.io.Console;

public class Namer {
  public static void main(String[] args) {
    whatsYourName("given");
    whatsYourName("middle");
    whatsYourName("family");
  }

  public static void whatsYourName(String type){
    Console myConsole = System.console();
    System.out.println("What is your " + type + " name?");
    String yourName = myConsole.readLine();
    System.out.println("Sooo... " + yourName + " is your " + type + " name.");
  }

}
