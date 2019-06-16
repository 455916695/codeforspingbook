package utils.DESUtils;

import org.junit.Test;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    //表示要进行加密的字段
    private String[] encryptPropNames = {"username", "password"};

    @Override
    protected String convertProperty(String propertyName, String propertyValue) {

        if (isEncryptProp(propertyName)) {
            String encryptString = DESUtils.getDecryptString(propertyValue);
            System.out.println(encryptString);

            return encryptString;
        } else {
            return propertyValue;
        }
    }

    /**
     * 判断是否需要进行加密
     */
    private boolean isEncryptProp(String propertyName) {

        for (String encryptPropName : encryptPropNames) {
            if (encryptPropName.equals(propertyName)) {
                return true;
            }
        }

        return false;
    }


    @Test
    public void test() {
        EncryptPropertyPlaceholderConfigurer e = new EncryptPropertyPlaceholderConfigurer();
        String username = e.convertProperty("username", "WnplV/ietfQ=");
        System.out.println(username);
    }
}
