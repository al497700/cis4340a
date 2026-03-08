final class ControlledStop implements Runnable {
  private boolean done = false; // not volatile — other threads may see stale value

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