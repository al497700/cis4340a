// Rule 03. Numeric Types and Operations (NUM) Example 3
// Compliant

public static long getInteger(DataInputStream is) throws IOException {
    return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
