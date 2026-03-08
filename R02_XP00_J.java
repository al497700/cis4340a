// Rule 02. Expressions (EXP) Example 0
// NonCompliant

public void deleteFile() {
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();

}
