import org.junit.Test;

public class MainClass
{
    @Test
    public void getLocalNumber()
    {
        int a = this.giveMeInt();
        System.out.println(a);
    }

    public int giveMeInt()
    {
        return 14;
    }
}
