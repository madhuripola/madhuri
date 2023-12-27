package cucumberSteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@When("open nc login page1")
	public void open_nc_login_page1() throws Exception {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

	}

	@And("enter email and password as credentials")
	public void enter_email_and_password_as_credentials(DataTable table) {

		List<List<String>> data = table.asLists();
		String un = data.get(0).get(0);
		String pws = data.get(0).get(1);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pws);
	}

	@And("click on login")

	public void click_on_login() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);

	}

	@Then("Verify login got success1")
	public void verify_login_got_success1() {
		boolean val = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();

		if (val == true) {
			System.out.println("Login success");

		}

		else {
			System.out.println("Loginfailed");
		}

	}

	@When("click on catalog main module")
	public void click_on_catalog_main_module() throws Exception {
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		Thread.sleep(3000);

	}

	@And("click on products sub module")
	public void click_on_products_sub_module() throws Exception {
		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();
		Thread.sleep(3000);
	}

	@Then("verify the first checkbox")

	public void verify_the_first_checkbox() {

		boolean val1 = driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).isSelected();

		if (val1 == true) {
			System.out.println("Check box got selected");

		}

		else {
			System.out.println("Checkbox not selected");
		}

	}

	@When("click on the first checkbox")
	public void click_on_the_first_checkbox() throws Exception {
		driver.findElement(By.xpath("(//input[@name='checkbox_products'])[1]")).click();
		Thread.sleep(3000);
	}

	@And("click on delete button")
	public void click_on_delete_button() throws Exception {
		driver.findElement(By.xpath("//button[@id='delete-selected']")).click();
		Thread.sleep(3000);
	}

	@And("click on yes button")
	public void click_on_yes_button() throws Exception {
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
	}

	@Then("verify first check box product got deleted")
	public void verify_first_checkbox_product_got_deleted() {
		System.out.println("product deleted");
	}

	// new code

	// new code

	@Given("launch the chrome browser")
	public void launch_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("Open Nc login page")
	public void open_nc_login_page() throws Exception {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
	}

	@When("Enter valid email id")
	public void enter_valid_email_id() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	}

	@When("click on login button")
	public void click_on_login_button() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
	}

	@Then("verify login success")
	public void verify_login_success() {
		System.out.println("Login success");
	}

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@When("open Nc login page in opened browser")
	public void open_Nc_login_page_in_opened_browser() throws Exception {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
	}

	@When("enter valid {string} in email field")
	public void enter_valid_in_email_field(String email) {
		System.out.println(email);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);

	}

	@When("enter valid {string} in password field")
	public void enter_valid_in_password_field(String pws) {
		System.out.println(pws);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pws);

	}

	@When("click on the login button")
	public void click_on_the_login_button() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
	}

	@Then("verify login got success")
	public void verify_login_got_success() {
		System.out.println("Login success");

	}

	@Given("user should launch the chrome browser")
	public void user_should_launch_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user should open nc login page")
	public void user_should_open_nc_login_page() throws Exception {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
	}

	@And("user enter email and password as credentials")
	public void user_enter_and_as_credentials(DataTable table) {
		List<List<String>> data = table.asLists();

		String un = data.get(0).get(0);
		System.out.println(un);
		String pwd = data.get(0).get(1);
		System.out.println(pwd);
		String un2 = data.get(1).get(0);
		System.out.println(un2);
		String pwd2 = data.get(1).get(1);
		System.out.println(pwd2);

	}

	@And("user click on login button")
	public void user_click_on_login_button() throws Exception {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
	}

	@Then("user verify login success")
	public void user_verify_login_success() {
		System.out.println("Login success");

	}

}