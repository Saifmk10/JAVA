package ENCRYPTION.DECRYPTION;

import javax.crypto.*;
import java.io.File;
import java.security.CryptoPrimitive;
import java.util.Base64;

public class AES {
    public static void main(String[] args) throws Exception{
        String text = "this is a text";

        // genrating the key
        KeyGenerator generatedKey = KeyGenerator.getInstance("AES");
        generatedKey.init(128);
        SecretKey secretKey = generatedKey.generateKey();

        // encrypting the text
        String encryptedtext = encrypt(text, secretKey);

        System.out.printf("encryptedtext : %s", encryptedtext);

    }
    

    

    public static String encrypt(String data , SecretKey key) throws Exception {
        Cipher encryption = Cipher.getInstance("AES");
        encryption.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedByte = encryption.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedByte);
    }
    
}
