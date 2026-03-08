public class Cycle {
  private final int balance;
  private static final Cycle c = new Cycle();
  private static final int deposit = (int) (Math.random() * 100);

  public Cycle() {
    balance = deposit - 10; // deposit is 0 here — initialization cycle!
  }

  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}