import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Junit5 extends Junit5Base{
    @Test
    @Order(1)
    public void genderType() throws InterruptedException{
        WebElement element = driver.findElement(By.cssSelector("img[src='https://cdn.dsmcdn.com/web/production/gender-popup-female.png']"));
        element.click();
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    @Order(2)
    public void hoverLoginButton() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("p[class='link-text']"))).build().perform();
        TimeUnit.SECONDS.sleep(2);

        WebElement element2=driver.findElement(By.cssSelector("div[class='login-button']"));
        element2.click();
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    @Order(3)
    public void login()throws InterruptedException{
        WebElement element=driver.findElement(By.cssSelector("input[id='login-email']"));
        element.sendKeys("ayseyuksell240819981@outlook.com");
        TimeUnit.SECONDS.sleep(2);

        WebElement element2=driver.findElement(By.cssSelector("input[id='login-password-input']"));
        element2.sendKeys("Aysenur123*");
        TimeUnit.SECONDS.sleep(2);

        WebElement element3=driver.findElement(By.cssSelector("button[class='q-primary q-fluid q-button-medium q-button submit']"));
        element3.click();
        TimeUnit.SECONDS.sleep(3);
    }

    @Test
    @Order(4)
    public void search()throws InterruptedException{
        WebElement element=driver.findElement(By.cssSelector("input[class='search-box']"));
        TimeUnit.SECONDS.sleep(3);
        element.sendKeys("Kazak", Keys.ENTER);
        TimeUnit.SECONDS.sleep(3);
    }

    @Test
    @Order(5)
    public void kazak() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
        WebElement empty=driver.findElement(By.cssSelector("div[id='container']"));
        TimeUnit.SECONDS.sleep(2);
        empty.click();

    }

    @Test
    @Order(6)
    public void tenthElementFavorite()throws InterruptedException{
        List<WebElement> imageList=driver.findElements(By.className("fvrt-btn-wrppr"));
        WebElement item=imageList.get(9);
        item.click();
        TimeUnit.SECONDS.sleep(3);
    }

    @Test
    @Order(7)
    public void product() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        List<WebElement> favoriteButton=driver.findElements(By.cssSelector("div[class='icon-container']"));
        WebElement item=favoriteButton.get(1);
        item.click();
        TimeUnit.SECONDS.sleep(2);
    }

    /*
    @Test
    @Order(8)
    public void favorites() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        List<WebElement> sizeSelection=driver.findElements(By.cssSelector("div[class='size-dropdown cursor ']"));
        WebElement item=sizeSelection.get(9);
        item.click();

       // TimeUnit.SECONDS.sleep(2);
       //  WebElement size=driver.findElement(By.cssSelector("ul[class='lower-dropdown-ul']>li"));
       // size.click();


    }


*/ //wait=new WebDriverWait()

    }
