import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5Base {



    WebDriver driver;

    @BeforeAll
    public void beforeAll() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(3);
        driver.get("https://www.trendyol.com/");
        TimeUnit.SECONDS.sleep(3);
    }

    @AfterAll
    public void afterAll(){
      //  driver.quit();
    }

}


