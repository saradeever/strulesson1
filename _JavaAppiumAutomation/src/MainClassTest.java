import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        MainClass mc = new MainClass();
        Assert.assertEquals ("The function 'getLocalNumber' returns not 14",14,mc.getLocalNumber());
    }

    @Test
    public void testGetClassNumber(){
        MainClass mc = new MainClass();
        Assert.assertTrue("The function 'getClassNumber' returns number NOT more then 45", mc.getClassNumber()>45);
    }

    //В классе MainClassTest написать тест (назвать testGetClassString), который проверяет, что метод getClassString возвращает строку, в которой есть подстрока “hello” или “Hello”, если нет ни одной из подстрок - тест падает.
    @Test
    public void testGetClassString(){
        MainClass mc = new MainClass();
        String str = mc.getClassString();
        boolean compare_result = str.matches(".*[H|h]ello.*");
        Assert.assertTrue("The string doesn't contain a word 'Hello' or 'hello'",compare_result);
    }
}
