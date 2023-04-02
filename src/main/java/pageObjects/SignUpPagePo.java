package pageObjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.Assert;

public class SignUpPagePo extends absPagePo{

    String urlAddress = "https://partners.xyte.io/auth/sign-in";

    String googleButton = "כניסה באמצעות Google";

    String signInButton = "Sign In";

    String emailAddress = "email";

    String password = "password";
    public SignUpPagePo(Page page) {
    }

    //TODO Move to abstract page
    public void validatePage(Page page) {
        Assert.assertTrue(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(googleButton)).isVisible());
    }

    public void signup(Page page) {
        //Todo add your creds
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(emailAddress)).fill("");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(password)).fill("");
    }
    public void clickSigninButton(Page page) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(signInButton)).click();
    }
    public void navigateToPage(Page page) {
        page.navigate(urlAddress);
    }
}
