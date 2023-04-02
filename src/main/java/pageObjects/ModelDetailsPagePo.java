package pageObjects;

import com.microsoft.playwright.Page;
import org.junit.Assert;

public class ModelDetailsPagePo extends absPagePo {
    String urlAddress = "https://partners.xyte.io/models";

    String modelName = "Model Details";

    String delete = "Delete";
    String confirm = "Confirm";
    String noModels = "No models";

    public ModelDetailsPagePo(Page page) {

    }

    //TODO Move to abstract page
    public void validatePage(Page page) {
        Assert.assertTrue(page.getByText(modelName).isVisible());
    }

    public void validateModelExists(Page page) {
        Assert.assertTrue(page.getByText(super.displayModelName).nth(1).isVisible());
    }

    public void validateModelNotExists(Page page) {
        Assert.assertFalse(page.getByText(super.displayModelName).isVisible());
    }
    public void navigateToPage(Page page) {
        page.navigate(urlAddress);
    }
    public void clickDeleteButtonAndConfirm(Page page) {
        page.getByText(delete).click();
        page.getByText(confirm).click();
    }

    public void validateNoModelsLabel(Page page) {
        Assert.assertTrue(page.getByText(noModels).isVisible());
    }
}
