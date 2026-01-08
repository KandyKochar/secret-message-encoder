/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kandy kochar
 */
/**
 * This class represents a secret message that can be encrypted and decrypted
 * using a Caesar cipher with a specified displacement.
 */
public class SecretMessage {
    private String originalMessage;
    private char[] encode;
    private char[] decode;
    private int displacement;
    
    /**
     * Constructs a SecretMessage object with the given message and displacement
     * @param message The original message to encrypt
     * @param displacement The shift value for the cipher
     */
    public SecretMessage(String message, int displacement) {
        this.originalMessage = message.toUpperCase();
        this.displacement = displacement;
        this.encode = generateEncryptionCode();
        this.decode = generateDecryptionCode();
    }
    
    /**
     * Generates the encryption code character array
     * @return The encryption code array
     */
    private char[] generateEncryptionCode() {
        char[] encryptionCode = new char[26];
        for (int i = 0; i < 26; i++) {
            encryptionCode[i] = (char)(65 + ((i + displacement) % 26));
        }
        return encryptionCode;
    }
    
    /**
     * Generates the decryption code character array
     * @return The decryption code array
     */
    private char[] generateDecryptionCode() {
        char[] decryptionCode = new char[26];
        for (int i = 0; i < 26; i++) {
            decryptionCode[i] = (char)(65 + ((i - displacement + 26) % 26));
        }
        return decryptionCode;
    }
    
    /**
     * Gets the encrypted secret message
     * @return The encrypted message
     */
    public String getSecretMessage() {
        return StringUtility.encrypt(originalMessage, encode);
    }
    
    /**
     * Gets the decrypted message
     * @return The decrypted original message
     */
    public String getDecodedMessage() {
        return StringUtility.decrypt(getSecretMessage(), decode);
    }
    
    /**
     * Returns a string representation of the encryption/decryption information
     * @return Formatted string with codes and messages
     */
    @Override
    public String toString() {
        return "Encryption Code: " + new String(encode) + "\n" +
               "Secret Message: " + getSecretMessage() + "\n" +
               "Decryption Code: " + new String(decode) + "\n" +
               "Decoded Message: " + getDecodedMessage();
    }
}