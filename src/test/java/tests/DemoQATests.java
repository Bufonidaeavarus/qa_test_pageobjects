package tests;

import org.junit.jupiter.api.Test;
import pages.DemoQAPage;
import testdata.Client;

public class DemoQATests {

    @Test
    void practiceFormTest() {
        DemoQAPage demoQAPage = new DemoQAPage();
        Client client = new Client();
        demoQAPage.openPage();
        demoQAPage.fillForm(client);
        demoQAPage.checkData(client);
    }
}