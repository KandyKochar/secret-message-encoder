/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kandy kochar
 */
/**
 * This class provides static methods for encrypting and decrypting messages
 * using a character substitution cipher.
 */
public class StringUtility {
    
    /**
     * Encrypts a message using the provided encryption code
     * @param message The original message to encrypt
     * @param encryptionCode The character array containing substitution values
     * @return The encrypted secret message
     */
    public static String encrypt(String message, char[] encryptionCode) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                int difference = chars[i] - 'A';
                chars[i] = encryptionCode[difference];
            }
        }
        return new String(chars);
    }
    
    /**
     * Decrypts a message using the provided decryption code
     * @param secretMessage The encrypted message to decrypt
     * @param decryptionCode The character array containing reverse substitution values
     * @return The decrypted original message
     */
    public static String decrypt(String secretMessage, char[] decryptionCode) {
        // Decryption uses the same process as encryption but with the decryption code
        return encrypt(secretMessage, decryptionCode);
    }
}