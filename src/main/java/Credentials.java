import java.util.Random;

public class Credentials {
    static String getRandomString(){
        Random random = new Random();
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String randomString = "";
        int length = 5;
        char[] text = new char[length];

        for (int i = 0; i<length; i++){
            text[i] = alphabet.charAt(random.nextInt(alphabet.length()));
        }
        for (int i = 0; i<text.length; i++){
            randomString += text[i];
        }
        return randomString;
    }
}
