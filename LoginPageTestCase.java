package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.LoginPageOR;

public class LoginPageTestCase {

	LoginPageOR obj = new LoginPageOR();

	@Given("user should be in dashboard page")
	public void user_should_be_in_dashboard_page() throws InterruptedException {
		obj.launchApplication();
	}

	@When("user click on myaccount dropdown menu and clickon login option")
	public void user_click_on_myaccount_dropdown_menu_and_clickon_login_option() throws InterruptedException {
		obj.dashboardDropDownOperation();
	}

	@When("enter valid username and valid password and click on signin button")
	public void enter_valid_username_and_valid_password_and_click_on_signin_button() throws InterruptedException {
		obj.enterEmailId("Prajwalkumar@gmail.com");
		obj.enterPassword("Prajwal@007");
		obj.clickButton();
	}

	@Then("user should be able to logged in")
	public void user_should_be_able_to_logged_in() {
		obj.isLogoutDisplay();
	}

	@Then("close the browser")
	public void close_the_browser() {
		obj.closeBrowser();
	}

	@When("enter valid username and invalid password and click on signin button")
	public void enter_valid_username_and_invalid_password_and_click_on_signin_button() throws InterruptedException {
		obj.enterEmailId("Prajwalkumar@gmail.com");
		obj.enterPassword("12345678");
		obj.clickButton();
	}

	@Then("user should not be able to logged in")
	public void user_should_not_be_able_to_logged_in() {
		obj.isForgotPasswordDisplay();
	}

	@Then("forgot password link should be displayed in login page")
	public void forgot_password_link_should_be_displayed_in_login_page() {
		obj.isForgotPasswordDisplay();
	}

	@Then("create new account link should be displayed in login page")
	public void create_new_account_link_should_be_displayed_in_login_page() {
		obj.isRegisterNewAccountDisplay();
	}

}
