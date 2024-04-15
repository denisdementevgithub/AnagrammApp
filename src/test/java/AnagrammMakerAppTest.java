import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnagrammMakerAppTest {
    private static main.java.AnagrammMaker am;

    @BeforeClass
    public static void createNewAnagrammMaker() {
         am = new main.java.AnagrammMaker();
    }
    @Test
    public void anagrammMakerShouldTheSameWordIfWordHasOneLatter() {
        String string = "4586d";
        String expectedString = "4586d";
        String actualString = "";
        try {
            actualString = am.makeAnagramm(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(expectedString, actualString);
    }
    @Test
    public void anagrammMakerShouldReturnNotNullString() {
        String string = "fghd";
        String actualString = "";
        try {
            actualString = am.makeAnagramm(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(actualString);
    }
    @Test
    public void anagrammMakerShouldReverserWordIfWordHasOnlyLetters() {
        String string = "fghd";
        String expectedString = "dhgf";
        String actualString = "";
        try {
            actualString = am.makeAnagramm(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(expectedString, actualString);
    }
}
