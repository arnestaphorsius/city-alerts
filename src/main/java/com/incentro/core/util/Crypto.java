package main.java.com.incentro.core.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;

/**
 * @author Arne Staphorsius.
 * @since 22/08/16.
 */
public class Crypto {

  private static Logger log = LogManager.getLogger(Crypto.class);

  private static final String KEY_SPEC = "AES";
  private static final String ALGORITHM = "AES/CBC/PKCS5Padding";
  private static final byte[] KEY_VALUE = new byte[] {'S','a','f','e','t','y','I','n','t','e','l','l','i','g','e','n'};

  /**
   * Encrypt an input field.
   *
   * @param in the input value to encrypt.
   * @return the encrypted value
   */
  public static Object encrypt(Object in) {

    if (in == null) return null;

    try {
      Key key = new SecretKeySpec(KEY_VALUE, KEY_SPEC);

      byte[] salt = SecureRandom.getInstance("SHA1PRNG").generateSeed(16);
      IvParameterSpec iv = new IvParameterSpec(salt);

      Cipher c = Cipher.getInstance(ALGORITHM);
      c.init(Cipher.ENCRYPT_MODE, key, iv);

      byte[] encVal = c.doFinal(in.toString().getBytes("UTF-8"));

      return Base64.encodeBase64String(salt) + '$' + Base64.encodeBase64String(encVal);

    } catch (Exception e) {
      log.error(e);
      return in;
    }
  }

  /**
   * Decrypt a stored field into the original value.
   *
   * @param stored the encrypted input field.
   * @return the decrypted value.
   */
  @SuppressWarnings("unused")
  private static String decrypt(String stored) throws Exception {

    try {
      String[] saltAndValue = stored.split("\\$");

      if (saltAndValue.length != 2) {
        throw new IllegalStateException(
            "The stored password should have the form 'salt$hash'");
      }

      Key key = new SecretKeySpec(KEY_VALUE, KEY_SPEC);
      IvParameterSpec iv = new IvParameterSpec(Base64.decodeBase64(saltAndValue[0]));

      Cipher c = Cipher.getInstance(ALGORITHM);
      c.init(Cipher.DECRYPT_MODE, key, iv);

      byte[] decodedValue = Base64.decodeBase64(saltAndValue[1]);
      byte[] decValue = c.doFinal(decodedValue);

      return new String(decValue);

    } catch (Exception e) {
      log.error(e);
      return stored;
    }
  }
}
