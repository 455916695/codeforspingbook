package utils.DESUtils;

import com.decisive.pattern._7_adapter.classAdapter.Chicken;
import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.IOException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.Executors;

/**
 * DES 加密工具
 */
public class DESUtils {

    private static Key key;
    //    加密秘钥
    private static String KEY_STR = "myKey";

    static {
        try {
            KeyGenerator des = KeyGenerator.getInstance("DES");
            des.init(new SecureRandom(KEY_STR.getBytes()));
            key = des.generateKey();
            des = null;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * ② 对字符串进行DES加密，返回BASE64编码的加密字符串
     */
    public static String getEncryptString(String str) {
        BASE64Encoder base64En = new BASE64Encoder();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encyptStrBytes = cipher.doFinal(bytes);
            return base64En.encode(encyptStrBytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * ③ 对BASE64编码的加密字符串进行解密，返回解密后的字符串
     */
    public static String getDecryptString(String str) {
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {

            byte[] strBytes = base64Decoder.decodeBuffer(str);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryStrBytes = cipher.doFinal(strBytes);
            return new String(decryStrBytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * ④ 对入参的字符串进行加密，打印出加密后的串
     */
    @Test
    public void deSUtilsTest() {
        String username = DESUtils.getEncryptString("root");
        String password = DESUtils.getEncryptString("www.cn.123");

        System.out.println("加密后："+username);
        System.out.println("加密后："+password);

        username = DESUtils.getDecryptString(username);
        password = DESUtils.getDecryptString(password);

        System.out.println("解密后："+username);
        System.out.println("解密后："+password);

    }


}

