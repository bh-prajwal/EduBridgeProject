package objectRepository;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPageOR {

	WebDriver driver;

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement dropdown;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement loginLink;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailid;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;

	@FindBy(linkText = "Logout")
	WebElement logoutLink;

	@FindBy(css = "div[class='form-group'] a")
	WebElement forgotPwdLink;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement registerCustomerLink;

	public LoginPageOR() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Driver\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		PageFactory.initElements(driver, this);
	}

	public void launchApplication() throws InterruptedException {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	public void closeBrowser() {
		driver.close();
	}

	public void dashboardDropDownOperation() throws InterruptedException {
		dropdown.click();
		Thread.sleep(2000);
		loginLink.click();
		Thread.sleep(2000);
	}

	public void enterEmailId(String un) throws InterruptedException {
		emailid.sendKeys(un);
		Thread.sleep(1000);
	}

	public void enterPassword(String pwd) throws InterruptedException {
		password.sendKeys(pwd);
		Thread.sleep(1000);
	}

	public void clickButton() {
		loginbtn.click();
	}

	public void isForgotPasswordDisplay() {
		try {
			boolean forgotPwdStatus = forgotPwdLink.isDisplayed();
			Assert.assertTrue(forgotPwdStatus);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(false);
			System.out.println("Forgot password link is not displayed in application");
		}
	}

	public void isRegisterNewAccountDisplay() {
		try {
			boolean createNewAccountStatus = registerCustomerLink.isDisplayed();
			Assert.assertTrue(createNewAccountStatus);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(false);
			System.out.println("Create new account link is not displayed in application");
		}
	}

	public void isLogoutDisplay() {
		try {
			boolean logOutStatus = logoutLink.isDisplayed();
			Assert.assertTrue(logOutStatus);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(false);
			System.out.println("Logout link is not displayed in application");
		}
	}

}
