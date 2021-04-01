import org.junit.jupiter.api.Test;

public class DemoQATests {

    @Test
    void practiceFormTest() {
        DemoQAPage demoQAPage = new DemoQAPage();
        Client client = new Client();
        System.out.println("client.userNumber"+client.userNumber);
        demoQAPage.openPage();
        demoQAPage.fillForm(client);
        demoQAPage.checkData(client);
    }
}