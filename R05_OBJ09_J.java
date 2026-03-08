// Comparing by class name string — a malicious class with the same name can bypass this check!
if (auth.getClass().getName().equals(
    "com.application.auth.DefaultAuthenticationHandler")) {
  // ...
}