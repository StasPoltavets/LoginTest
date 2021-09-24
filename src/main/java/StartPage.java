import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class StartPage {
private WebDriver driver;



    public StartPage(WebDriver driver) {
        this.driver = driver;
    }


    private By logInButton = By.xpath("//button[@class='switch-form-btn is-active']");
    private By regFormButton = By.xpath("//button[@class='regform-btn']");
    private By emailField = By.xpath("//input[@id='email-field']");
    private By passwordField = By.xpath("//input[@id='password-field']");
    private By agePopup = By.xpath("//select[@id='age-field']");
    private By ageSelect = By.xpath("//select[@id='age-field']//option[@value='19'][contains(text(),'19')]");
    private By joinNowButton = By.xpath("//div[@id='submit-btn']");

    private By heading = By.xpath("//div[@class='reg-form-title']//p[contains(text(),'Sign up for')]");


    public StartPage clickLogIn (){
        driver.findElement(logInButton).click();
        return this;
    }
    public StartPage regFormButton (){
        driver.findElement(regFormButton).click();
        return this;

    }
    public  StartPage clickJoinNowButton (){
        driver.findElement(joinNowButton).click();
        return this;

    }
    public StartPage typeAgePopup (String age) {
        driver.findElement(agePopup).click();
        driver.findElement(ageSelect).click();
        return this;
    }
    public StartPage typeEmailField (String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }
    public StartPage typePasswordField (String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }


    public SearchPage register (String age, String email, String password){
        driver.findElement(agePopup).click();
        driver.findElement(ageSelect).click();
        //this.typeAgePopup(age);
        this.typeEmailField(email);
        this.typePasswordField(password);
        this.clickJoinNowButton();
        return new SearchPage(driver);
    }
    public StartPage getHeadingText(){
        driver.findElement(heading).getText();
        return this;
    }
    /*public String getHeadingText(){
        return driver.findElement(heading).getText();
    }

     */


}
