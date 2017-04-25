import java.io.Console;

public class ShipIt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How much does your parcel weigh in pounds?");
    String weight = myConsole.readLine();
    System.out.println("And how far in miles are you shipping it?");
    String distance = myConsole.readLine();

    Integer weightPrice = Integer.parseInt(weight) * 3;
    Integer distancePrice = Integer.parseInt(distance) * 2;
    Integer sum = distancePrice + weightPrice;
    Integer tax = sum / 10;
    Integer total = sum + tax;

    System.out.println("+----------------------------+");
    System.out.println("|          Ship-It           ");
    System.out.println("|                            ");
    System.out.println("|       Distance  " + distance + "        ");
    System.out.println("|       $2 a mile " + distancePrice + "        ");
    System.out.println("|                            ");
    System.out.println("|       Weight " + weight + "            ");
    System.out.println("|       $3 a pound " + weightPrice + "        ");
    System.out.println("|                ");
    System.out.println("|       Price " + sum + "             ");
    System.out.println("|       Tax 10% " + tax + "            ");
    System.out.println("|       Total " + total + "             ");
    System.out.println("|                            ");
    System.out.println("|       Thanks for coming!               ");
    System.out.println("|                            ");
    System.out.println("+----------------------------+");

    System.out.println(total);

  }
}
