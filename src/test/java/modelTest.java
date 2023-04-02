
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Test;
import pageObjects.*;

public class modelTest {

    @Test
    public void createModelHappyFlow() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            SignUpPagePo signUpPagePo = new SignUpPagePo(page);
            signUpPagePo.navigateToPage(page);
            signUpPagePo.signup(page);
            signUpPagePo.clickSigninButton(page);
            HomePagePo homePagePo = new HomePagePo(page);
            homePagePo.validatePage(page);
            ModelsPagePo modelsPagePo = new ModelsPagePo(page);
            modelsPagePo.navigateToPage(page);
            modelsPagePo.clickAddModelButton(page);
            AddModelPagePo addModelPagePo = new AddModelPagePo(page);
            addModelPagePo.addModelOperation(page);
            addModelPagePo.clickSaveButton(page);
            ModelDetailsPagePo modelDetailsPagePo = new ModelDetailsPagePo(page);
            modelDetailsPagePo.validateModelExists(page);
            modelDetailsPagePo.clickDeleteButtonAndConfirm(page);
            modelDetailsPagePo.validateModelNotExists(page);

        }
    }
}