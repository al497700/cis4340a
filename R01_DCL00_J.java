// Rule 01. Declarations and Initialization (DCL) Example 0 
// Compliant

public class Cycle {
  private final int balance;
  private static final int deposit = (int) (Math.random() * 100);
  private static final Cycle c = new Cycle(); // moved AFTER deposit

  public Cycle() {
    balance = deposit - 10; // deposit is now properly initialized
  }

  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}

