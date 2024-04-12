/* This class is main application class */
import java.util.Scanner;

public class AnagrammMakerApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите набор слов для обработки:");
        Scanner sa = new Scanner(System.in);
        String line = sa.nextLine();
        AnagrammMaker am = new AnagrammMaker();
        System.out.println("Анаграмма:" + am.makeAnagramm(line));

    }
}
