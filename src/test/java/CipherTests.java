import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
    @Test
    public void CeaserLowercaseTest(){
        CaesarCipher c = new CaesarCipher();
        Assert.assertEquals("zyx",c.caesarCipher("abc"));
    }
    @Test
    public void CeaserUppercaseTest(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("ZYX", c.caesarCipher("ABC"));
    }
    @Test
    public void CeaserMixedTest(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("zYx", c.caesarCipher("aBc"));
    }
    @Test
    public void CeaserNumTest(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("", c.caesarCipher("1"));
    }
    @Test
    public void CeaserSpecialCharacters(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("zyx!", c.caesarCipher("abc!"));
    }
    @Test
    public void CeaserCaseWithSpace(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("z yx", c.caesarCipher("a bc"));
    }
    @Test
    public void CeaserSpaceAndPunc(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("z y x !", c.caesarCipher("a b c !"));
    }

    @Test
    public void ElbonianLowercase(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("010203", e.elbonainCipher("abc"));
    }
    @Test
    public void ElbonianMixed(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("010203", e.elbonainCipher("aBc"));
    }
    @Test
    public void ElbonianUppercase(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("010203", e.elbonainCipher("ABC"));
    }
    @Test
    public void ElbonianWithSpace(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("010203S", e.elbonainCipher("ABC "));
    }
    @Test
    public void ElbonianWithUnderscore(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("0010203S", e.elbonainCipher("_ABC "));
    }
    @Test
    public void ElbonainWithPunc(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("0010203S!", e.elbonainCipher("_ABC !"));
    }
    @Test
    public void ElbonianOver140Char(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("0101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101", e.elbonainCipher("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"));
    }

    @Test
    public void ElbonianEmpty(){
        ElbonianCipher e = new ElbonianCipher();
        assertEquals("", e.elbonainCipher(""));
    }

    @Test
    public void CaesarEmpty(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("", c.caesarCipher(""));
    }

    @Test
    public void CaesarNumber(){
        CaesarCipher c = new CaesarCipher();
        assertEquals("", c.caesarCipher("123"));
    }
}
