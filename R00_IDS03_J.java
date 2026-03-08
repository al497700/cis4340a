// Rule 00. Input Validation and Data Sanitization (IDS) Example 3
// NonCompliant

if (loginSuccessful) {
    logger.severe("User login succeeded for: " + username);
} else {
    logger.severe("User login failed for: " + username);

}

