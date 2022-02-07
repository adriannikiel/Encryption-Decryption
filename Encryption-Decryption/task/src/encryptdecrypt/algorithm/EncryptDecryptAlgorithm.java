package encryptdecrypt.algorithm;

public class EncryptDecryptAlgorithm {
    private Algorithm algorithm;

    public EncryptDecryptAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String encryptText(String message, int key) {
        return algorithm.encryptText(message, key);
    }

    public String decryptText(String ciphertext, int key) {
        return algorithm.decryptText(ciphertext, key);
    }
}