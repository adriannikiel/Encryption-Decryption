package encryptdecrypt.algorithm;

public interface Algorithm {
    String encryptText(String message, int key);
    String decryptText(String ciphertext, int key);
}