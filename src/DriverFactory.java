import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver open(String browserType) {
        if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C://selenium//drivers//geckodriver//geckodriver.exe");
            return new FirefoxDriver();
        }
        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C://selenium//drivers//chromedriver//chromedriver.exe");
            return new ChromeDriver();
        }
        if (browserType.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "C://selenium//drivers//iedriverserver//IEDriverServer.exe");
            return new InternetExplorerDriver();
        } else {
            System.out.println("browser " + browserType + " is invalid, please try again");
        }
        return null;
    }

}