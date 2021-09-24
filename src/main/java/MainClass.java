import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stanislav.poltavets\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        Dimension dimension = new Dimension(375, 812);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(dimension);
        driver.get("https://m.benaughty.com/");

        StartPage startPage = new StartPage(driver);
        startPage.regFormButton().c
    }
}
