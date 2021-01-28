import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    @Before
    public void doBeforeTest() {
        Selenium.setUp();
    }

    @Test
    public void searchByKeywordTest(){
        Selenium.searchByKeyword("Baranauskas");
        compareResultsTest();
    }

    public void compareResultsTest() {
        int results = Selenium.compareResults();
        Assert.assertEquals(160000, results);
    }

    @After
    public void close() { Selenium.close();}

}
