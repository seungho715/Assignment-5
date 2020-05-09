import org.junit.Assert;
import org.junit.Test;
/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
    @Test
    public void CeaserLowercaseTest(){
        CaesarCipher c = new CeaserCipher();
        Assert.assertEquals("zyx",c.setText("abc"));
    }
    @Test
    public void CeaserUppercaseTest(){
        CeaserCipher c = new CeaserCipher();
        Assert.assertEquals("ZYX", c.setTest("ABC"));
    }
    @Test
    public void CeaserMixedTest(){
        CeaserCipher c = new CeaserCipher();
        Assert.assertEquals("zYx", c.setText("aBc"));
    }
    @Test
    public void CeaserNumTest(){
        CeaserCipher c = new CeaserCipher();
        Assert.assertEquals("", c.setText("1"));
    }
    @Test
    public void CeaserSpecialCharacters(){
        CeaserCipher c = new CeaserCipher();
        Assert.assertEquals("zyx!", c.setText("abc!"));
    }
    @Test
    public void CeaserCaseWithSpace(){
        CeaserCipher c = new CeaserCipher();
        Assert.assertEquals("z yx", c.setText("a bc"));
    }
    @Test
    public void CeaserSpaceAndPunc(){
        CeaserCipher c = new CeaserCipher();
        Assert.assertEquals("z y x !", c.setText("a b c !"));
    }
    @Test
    public void ElbonianLowercase(){
        ElbonianCipher e = new ElbonainCipher();
        Assert.assertEquals("010203", e.setText("abc"));
    }
    @Test
    public void ElbonianMixed(){
        ElbonianCipher e = new ElbonainCipher();
        Assert.assertEquals("012703", e.setText("aBc"));
    }
    @Test
    public void ElbonianUppercase(){
        ElbonianCipher e = new ElbonainCipher();
        Assert.assertEquals("272829", e.setText("ABC"));
    }
    @Test
    public void ElbonianWithSpace(){
        ElbonianCipher e = new ElbonainCipher();
        Assert.assertEquals("272829S", e.setText("ABC "));
    }
    @Test
    public void ElbonianWithUnderscore(){
        ElbonianCipher e = new ElbonainCipher();
        Assert.assertEquals("0272829S", e.setText("_ABC "));
    }
    @Test
    public void ElbonainWithPunc(){
        ElbonianCipher e = new ElbonainCipher();
        Assert.assertEquals("0272829S!", e.setText("_ABC !"));
    }
    @Test
    public void ElbonianOver140Char(){
        ElbonianCipher e = new ElbonainCipher();
        Assert.assertEquals("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", e.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"));
    }
}
