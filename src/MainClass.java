import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.TexBoxPage;

import java.util.concurrent.TimeUnit;

public class MainClass {

    private static WebDriver driver = null;

    public static void main(String[] args) {

        String browserType = "chrome";

        driver = DriverFactory.open(browserType);
        assert driver != null;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.demoqa.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        WebDriverWait wait = new WebDriverWait(driver,10);
        MainPage.textBoxElement(driver).click();
        TexBoxPage.fullName(driver).click();
        TexBoxPage.userName(driver).sendKeys("Evgheni Barducov");
        TexBoxPage.userEmail(driver).sendKeys("Evgheni.Barducov@seavus.com");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"permanentAddress\"]"))).sendKeys("apt 7" + "\n" + "Grigore Vieru 15" + "\n" + "Chisinau, Moldova");
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-1\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox"))).click();
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("item-3"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("addNewRecordButton"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("firstName"))).sendKeys("John");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("lastName"))).sendKeys("Travolta");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("userEmail"))).sendKeys("John.Travolta@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("age"))).sendKeys("56");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("salary"))).sendKeys("56000000");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("department"))).sendKeys("cinema production");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("delete-record-3"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-record-4"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("department"))).clear();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("department"))).sendKeys("retired");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("item-4"))).click();
        Actions act = new Actions(driver);
        WebElement doubleClickBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn")));
        act.doubleClick(doubleClickBtn).perform();
        WebElement rightClickBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("rightClickBtn")));
        act.contextClick(rightClickBtn).perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"))).click();






        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.close();
        driver.quit();
    }

}
