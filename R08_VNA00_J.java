// Rule 08. Visibility and Atomicity (VNA) Example 0
// Compliant

final class ControlledStop implements Runnable {
  private volatile boolean done = false; // volatile ensures visibility

  @Override public void run() {
    while (!done) {
      try {
        Thread.currentThread().sleep(1000);
      } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public void shutdown() {
    done = true;
  }
}

