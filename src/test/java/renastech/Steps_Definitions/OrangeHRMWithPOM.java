package renastech.Steps_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import renastech.pages.Home_Page;
import renastech.pages.Login_Page;
import renastech.utils.CommonUtils;

public class OrangeHRMWithPOM {

    Home_Page home = new Home_Page();

    @Given("The user wants login as admin")
    public void the_user_wants_login_as_admin() {

        Login_Page login_page = new Login_Page();

        login_page.setUsername();
        login_page.setPassword();
        login_page.setLoginButton();

    }
    @Then("The user wants to verify dashboard")
    public void the_user_wants_to_verify_dashboard() {

        CommonUtils.hardWait(3000);
        Assert.assertTrue(home.getDashboard().isDisplayed());

    }
    @When("The user wants to go to admin")
    public void the_user_wants_to_go_to_admin() {
        home.setAdmin();
    }
    @Then("The user wants to go to Nationalities")
    public void the_user_wants_to_go_to_nationalities() {

    }
    @Then("The user wants to add new Nationalities")
    public void the_user_wants_to_add_new_nationalities() {

    }
    @Then("The user wants to add Nationalities as {string}")
    public void the_user_wants_to_add_nationalities_as(String string) {

    }
    @And("The user should be able to see {string} in Nationality page")
    public void the_user_should_be_able_to_see_in_nationality_page(String string) {

    }
}
