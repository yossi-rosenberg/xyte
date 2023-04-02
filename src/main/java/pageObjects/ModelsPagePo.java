package pageObjects;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.Assert;

public class ModelsPagePo extends absPagePo{
    String urlAddress = "https://partners.xyte.io/models";

    String addModelButton = "Add Model";

    public ModelsPagePo(Page page) {

    }

    //TODO Move to abstract page
    public void validatePage(Page page) {
        page.getByText(addModelButton).isVisible();
    }
    public void navigateToPage(Page page) {
        page.navigate(urlAddress);
    }
    public void clickAddModelButton(Page page) {
        page.getByText(addModelButton).click();
    }
}
