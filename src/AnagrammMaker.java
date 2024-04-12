/* This class makes anagramm words from string*/
import java.sql.Array;
import java.util.Arrays;

public class AnagrammMaker {

    public String makeAnagramm(String line) throws Exception {
        if (line == null) throw new Exception("String is null");
        if (line.trim().isEmpty()) throw new Exception("String is empty");
        String[] strArray = line.split(" ");
        String[] reversedStrArray = new String[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            reversedStrArray[i] = reversedWord(strArray[i]);
        }
        return String.join(" ", reversedStrArray);
    }

    private String reversedWord(String s) {
        int index = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length - index; i++) {
            Character temp = charArray[i];
            if (Character.isLetter(temp)) {
                for (int j = charArray.length - index - 1; j >= index; j--) {
                    if (Character.isLetter(charArray[j])) {
                        charArray[i] = charArray[j];
                        charArray[j] = temp;
                        index = charArray.length - j;
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c:charArray) {
            sb.append(c);
        }
        return sb.toString();
    }
}
