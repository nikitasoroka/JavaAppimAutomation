import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String b = this.testedString();

        Assert.assertTrue("There is no any Hello or hello string!", b.contains("Hello") || b.contains("hello"));
    }

    public String testedString() {
        return this.getClassString();
    }
}