package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TexBoxPage {
    private static WebElement element = null;

    public static WebElement fullName(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
        return element;
    }
    public static WebElement userName(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        return element;
    }
    public static WebElement userEmail(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        return element;
    }
}

