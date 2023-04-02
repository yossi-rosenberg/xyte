package pageObjects;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.Assert;

public class HomePagePo extends absPagePo {
    String urlAddress = "partners.xyte.io/home";

    String inviteMembersTextLocator = "Invite Members";

    public HomePagePo(Page page) {
    }

    //TODO Move to abstract page
    public void validatePage(Page page) {
        Assert.assertTrue(page.getByText(inviteMembersTextLocator).isVisible());
    }
    public void navigateToPage(Page page) {
        page.navigate(urlAddress);
    }
}
