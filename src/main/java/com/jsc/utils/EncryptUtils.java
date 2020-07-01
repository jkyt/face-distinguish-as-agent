package com.jsc.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author fanqing on 2019/10/17
 */
public class EncryptUtils {

    /**
     * 根据相应的加密算法、密钥、源文件进行加密，返回加密后的文件
     *
     * @param Algorithm 加密算法:DES,AES
     * @param key
     * @param info
     * @return
     */
    public String encrypt(String Algorithm, SecretKey key, String info) {
        // 定义要生成的密文
        byte[] cipherByte = null;
        try {
            // 得到加密/解密器
            Cipher c1 = Cipher.getInstance(Algorithm);
            // 用指定的密钥和模式初始化Cipher对象
            // 参数:(ENCRYPT_MODE, DECRYPT_MODE, WRAP_MODE,UNWRAP_MODE)
            c1.init(Cipher.ENCRYPT_MODE, key);
            // 对要加密的内容进行编码处理,
            cipherByte = c1.doFinal(info.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回密文的十六进制形式
        return byte2hex(cipherByte);
    }

    /**
     * 根据相应的解密算法、密钥和需要解密的文本进行解密，返回解密后的文本内容
     *
     * @param Algorithm
     * @param key
     * @param info
     * @return
     */
    public String decrypt(String Algorithm, SecretKey key, String info) {
        byte[] cipherByte = null;
        try {
            // 得到加密/解密器
            Cipher c1 = Cipher.getInstance(Algorithm);
            // 用指定的密钥和模式初始化Cipher对象
            c1.init(Cipher.DECRYPT_MODE, key);
            // 对要解密的内容进行编码处理
            cipherByte = c1.doFinal(hex2byte(info));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(cipherByte);
    }

    /**
     * 根据相应的解密算法、指定的密钥和需要解密的文本进行解密，返回解密后的文本内容
     *
     * @param Algorithm 加密算法:DES,AES
     * @param sSrc
     * @param sKey      这个key可以由用户自己指定 注意AES的长度为16位,DES的长度为8位
     * @return
     */
    public static String decrypt(String Algorithm, String sSrc, String sKey) throws Exception {
        try {
            // 判断Key是否正确
            if (sKey == null) {
                throw new Exception("Key为空null");
            }
            // 判断采用AES加解密方式的Key是否为16位
            if (Algorithm.equals("AES") && sKey.length() != 16) {
                throw new Exception("Key长度不是16位");
            }
            // 判断采用DES加解密方式的Key是否为8位
            if (Algorithm.equals("DES") && sKey.length() != 8) {
                throw new Exception("Key长度不是8位");
            }
            byte[] raw = sKey.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, Algorithm);
            Cipher cipher = Cipher.getInstance(Algorithm);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted1 = hex2byte(sSrc);
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original);
                return originalString;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * 根据相应的加密算法、指定的密钥、源文件进行加密，返回加密后的文件
     *
     * @param Algorithm 加密算法:DES,AES
     * @param sSrc
     * @param sKey      这个key可以由用户自己指定 注意AES的长度为16位,DES的长度为8位
     * @return
     */
    public static String encrypt(String Algorithm, String sSrc, String sKey) throws Exception {
        // 判断Key是否正确
        if (sKey == null) {
            throw new Exception("Key为空null");
        }
        // 判断采用AES加解密方式的Key是否为16位
        if (Algorithm.equals("AES") && sKey.length() != 16) {
            throw new Exception("Key长度不是16位");
        }
        // 判断采用DES加解密方式的Key是否为8位
        if (Algorithm.equals("DES") && sKey.length() != 8) {
            throw new Exception("Key长度不是8位");
        }
        byte[] raw = sKey.getBytes("ASCII");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, Algorithm);
        Cipher cipher = Cipher.getInstance(Algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes());
        return byte2hex(encrypted);
    }

    /**
     * 十六进制字符串转化为2进制
     *
     * @param strhex
     * @return
     */
    public static byte[] hex2byte(String strhex) {
        if (strhex == null) {
            return null;
        }
        int l = strhex.length();
        if (l % 2 == 1) {
            return null;
        }
        byte[] b = new byte[l / 2];
        for (int i = 0; i != l / 2; i++) {
            b[i] = (byte) Integer.parseInt(strhex.substring(i * 2, i * 2 + 2), 16);
        }
        return b;
    }

    /**
     * 将二进制转化为16进制字符串
     *
     * @param b 二进制字节数组
     * @return String
     */
    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }
        return hs.toUpperCase();
    }

    /**
     * 采用DES随机生成的密钥进行加密
     *
     * @param key
     * @param info
     * @return
     */
    public String encryptToDES(SecretKey key, String info) {
        return encrypt("DES", key, info);
    }

    /**
     * 采用DES指定密钥的方式进行加密
     *
     * @param key
     * @param info
     * @return
     * @throws Exception
     */
    public String encryptToDES(String key, String info) throws Exception {
        return encrypt("DES", info, key);
    }

    /**
     * 采用DES随机生成密钥的方式进行解密，密钥需要与加密的生成的密钥一样
     *
     * @param key
     * @param sInfo
     * @return
     */
    public String decryptByDES(SecretKey key, String sInfo) {
        return decrypt("DES", key, sInfo);
    }

    /**
     * 采用DES用户指定密钥的方式进行解密，密钥需要与加密时指定的密钥一样
     *
     * @param key
     * @param sInfo
     * @return
     */
    public String decryptByDES(String key, String sInfo) throws Exception {
        return decrypt("DES", sInfo, key);
    }

    /**
     * 采用AES随机生成的密钥进行加密
     *
     * @param key
     * @param info
     * @return
     */
    public String encryptToAES(SecretKey key, String info) {
        return encrypt("AES", key, info);
    }

    /**
     * 采用AES指定密钥的方式进行加密
     *
     * @param key
     * @param info
     * @return
     * @throws Exception
     */
    public String encryptToAES(String key, String info) throws Exception {
        return encrypt("AES", info, key);
    }

    /**
     * 采用AES随机生成密钥的方式进行解密，密钥需要与加密的生成的密钥一样
     *
     * @param key
     * @param sInfo
     * @return
     */
    public String decryptByAES(SecretKey key, String sInfo) {
        return decrypt("AES", key, sInfo);
    }

    /**
     * 采用AES用户指定密钥的方式进行解密，密钥需要与加密时指定的密钥一样
     *
     * @param key
     * @param sInfo
     * @return
     */
    public String decryptByAES(String key, String sInfo) throws Exception {
        return decrypt("AES", sInfo, key);
    }

    public static void main(String[] args) throws Exception {
        //秘钥生成器
        EncryptUtils encryptUtils = new EncryptUtils();
        String source = "2019-10-24";
        String key = "jsc@5027";
        String str1 = encryptUtils.encryptToDES(key, source);
        System.out.println("DES加密后为:" + str1);
        // 使用这个密匙解密
        String str2 = encryptUtils.decryptByDES(key, str1);
        System.out.println("DES解密后为：" + str2);

//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        for (int i = 0; i < 12; i++) {
//            date.setYear(122);
//            date.setMonth(i);
//            for (int j = 0; j < 3; j++) {
//                date.setDate(j * 10 + 1);
//                String source = format.format(date);
//                String str1 = encryptUtils.encryptToDES(key, source);
//                System.out.println(source + " " + str1);
//            }
//        }


        String now = "2019-10-24";
        System.out.println(now.compareTo(source));
    }
}
