package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunnerClass {
	WebDriver driver;
	@Given("user open borwser And navigate to application url")
	public void user_open_borwser_And_navigate_to_application_url() {
		System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost:8083/TestMeApp");
	}

	@When("user clicks on signin And click on new user registration")
	public void user_clicks_on_signin_And_click_on_new_user_registration() {
	    driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enter userName as {string} in username field")
	public void user_enter_userName_as_in_username_field(String un) {
	    driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enter {string} in fname field")
	public void user_enter_in_fname_field(String fn) {
		driver.findElement(By.name("firstName")).sendKeys(fn);
	}

	@When("user enter {string} in lname field")
	public void user_enter_in_lname_field(String ln) {
	    driver.findElement(By.name("lastName")).sendKeys(ln);
	}

	@When("user enter {string} in password field")
	public void user_enter_in_password_field(String pwd) {
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("user enter {string} in confirm password field")
	public void user_enter_in_confirm_password_field(String cnpwd) {
	    driver.findElement(By.name("confirmPassword")).sendKeys(cnpwd);;
	}

	@When("user select gender")
	public void user_select_gender() {
	    driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("user enter {string} in email field")
	public void user_enter_in_email_field(String email) {
	    driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enter {string} in mobileNumber field")
	public void user_enter_in_mobileNumber_field(String pno) {
	    driver.findElement(By.name("mobileNumber")).sendKeys(pno);
	}
	
	@When("user enter {string} in DOB field")
	public void user_enter_in_DOB_field(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("user enter {string} in address field")
	public void user_enter_in_address_field(String address) {
		driver.findElement(By.name("address")).sendKeys(address);
	}

	@When("user enter {string} in securityQuestion field")
	public void user_enter_in_securityQuestion_field(String que) {
		driver.findElement(By.name("securityQuestion")).sendKeys(que);
	}

	@When("user enter {string} in answer field")
	public void user_enter_in_answer_field(String ans) {
		driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@Then("user click on register button")
	public void user_click_on_register_button() {
		driver.findElement(By.name("Submit")).click();
	}
}
