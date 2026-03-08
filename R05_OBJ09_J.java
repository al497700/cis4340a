// Rule 05. Object Orientation (OBJ) Example 9
// Compliant

// Compare the actual class objects — not their names
if (auth.getClass() == com.application.auth.DefaultAuthenticationHandler.class) {
  // ...
}

