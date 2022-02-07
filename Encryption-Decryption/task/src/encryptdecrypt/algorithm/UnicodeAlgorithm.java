package encryptdecrypt.algorithm;

public class UnicodeAlgorithm implements Algorithm {

    @Override
    public String encryptText(String message, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = (char) (message.charAt(i) + key);
            result.append(c);
        }

        return result.toString();
    }

    @Override
    public String decryptText(String ciphertext, int key) {
        return encryptText(ciphertext, -key);
    }

}