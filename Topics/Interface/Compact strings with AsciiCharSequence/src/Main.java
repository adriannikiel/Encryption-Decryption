import java.nio.charset.StandardCharsets;
import java.util.*;

class AsciiCharSequence implements CharSequence {

    byte[] asciiChars;

    public AsciiCharSequence(byte[] bytes) {
        this.asciiChars = bytes;
    }

    @Override
    public int length() {
        return asciiChars.length;
    }

    @Override
    public char charAt(int i) {
        return (char) asciiChars[i];
    }

    @Override
    public CharSequence subSequence(int iStart, int iEnd) {

        byte[] subAsciiChar = Arrays.copyOfRange(asciiChars, iStart, iEnd);

        return new AsciiCharSequence(subAsciiChar);
    }

    @Override
    public String toString() {
        return new String(asciiChars, StandardCharsets.UTF_8);
    }
}