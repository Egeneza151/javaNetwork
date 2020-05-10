package backupclient;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class HashingStuff {
    public static String hashSth(String data) throws NoSuchAlgorithmException{
        String hash = "";
        data = data + "jakassol2137!";
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(data.getBytes());
        byte[] digest = md.digest();
        hash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return hash;
    }
}
