import java.security.*;
import java.nio.charset.StandardCharsets;
public class L5T08 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        for (int i = 0; i < args.length; i++) {
            System.out.println(getSha256Hash(args[i]));
        }
    }
    private static String getSha256Hash(String s) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[]hashInBytes = md.digest(s.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}