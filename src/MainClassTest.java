import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        int b = this.testedValue();

        Assert.assertFalse("False. The class_number < 45", b < 45);
    }

    public int testedValue() {
        return this.Class_number();
    }
}