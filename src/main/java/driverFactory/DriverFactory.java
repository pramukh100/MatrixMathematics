package driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> thLocal = new ThreadLocal();

    public WebDriver inti_browser(String browser) {
        System.out.println(" The name of the browser is " + browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            thLocal.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            thLocal.set(new FirefoxDriver());
        } else{
            System.out.println("Please pass correct browser name " + browser);
        }
        getDriver().manage().window().maximize();
        return getDriver();
    }
    public static synchronized WebDriver getDriver() {
        return thLocal.get();
    }

}
