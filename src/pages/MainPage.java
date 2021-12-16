package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private static WebElement element = null;

    public static WebElement textBoxElement(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[3]"));
        return element;

    }
}

