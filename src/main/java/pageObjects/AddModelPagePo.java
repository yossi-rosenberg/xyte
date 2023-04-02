package pageObjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.Assert;

public class AddModelPagePo extends absPagePo{
    String baseCommandsText = "Base commands";
    String displayName = "name";

    String mobile = "mobile";

    String saveButtonText = "Save";


    public AddModelPagePo(Page page) {

    }

    //TODO Move to abstract page
    public void validatePage(Page page) {
        Assert.assertTrue(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(baseCommandsText)).isVisible());
    }

    public void addModelOperation(Page page) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(displayName)).fill(super.displayModelName);
        page.getByRole(AriaRole.CHECKBOX, new Page.GetByRoleOptions().setName(mobile)).check();
    }

    public void clickSaveButton(Page page) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(saveButtonText)).click();
    }
}
