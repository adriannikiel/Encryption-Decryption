package encryptdecrypt.algorithm;

public class ShiftAlgorithm implements Algorithm {

    @Override
    public String encryptText(String message, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char token = message.charAt(i);
            char c = encryptCharShift(token, key);
            result.append(c);
        }

        return result.toString();
    }

    @Override
    public String decryptText(String ciphertext, int key) {
        return encryptText(ciphertext, -key);
    }

    private char encryptCharShift(char token, int key) {

        final char minSmall = 'a';  //97
        final char maxSmall = 'z';  //122
        final char minBig = 'A';    //65
        final char maxBig = 'Z';    //90

        char c;

        if (token >= minSmall && token <= maxSmall) {
            c = charShiftParam(token, key, minSmall, maxSmall);
        } else if (token >= minBig && token <= maxBig) {
            c = charShiftParam(token, key, minBig, maxBig);
        } else {
            c = token;
        }

        return c;
    }

    private char charShiftParam(char token, int key, char minChar, char maxChar) {

        char c = (char) (token + key);

        if (c > maxChar) {
            c = (char) ((token + key - maxChar) + minChar - 1);
        }

        if (c < minChar) {
            c = (char) (maxChar - (minChar - (token + key)) + 1);
        }

        return c;
    }
}