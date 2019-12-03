import org.junit.Test;

public class MainClass {
    private String class_string = "Hello, World!";

    @Test
    public void testString() {
        String a = this.getClassString();
    }

    public String getClassString() {
        return class_string;
    }
}
