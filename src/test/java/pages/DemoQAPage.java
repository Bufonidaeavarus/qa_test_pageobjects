package pages;

import testdata.Client;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQAPage {
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }
    public void fillForm(Client client) {
        $("#firstName").setValue(client.firstName);
        $("#lastName").setValue(client.lastName);
        $("#userEmail").setValue(client.email);
        $(byText(client.gender)).click();
        $("#userNumber").setValue(client.userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1991");
        $(byXpath("(//div[contains(text(),'2')])[1]")).click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src\\test\\resources\\1.jpg"));
        $("#currentAddress").setValue(client.currentAddress);
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").scrollTo().click();
    }
    public void checkData(Client client) {
        $(byXpath("//tbody/tr[1]/td[2]")).shouldHave(text(client.firstName+" "+client.lastName));
        $(byXpath("//tbody/tr[2]/td[2]")).shouldHave(text(client.email));
        $(byXpath("//tbody/tr[3]/td[2]")).shouldHave(text(client.gender));
        $(byXpath("//tbody/tr[4]/td[2]")).shouldHave(text(client.userNumber));
        $(byXpath("//tbody/tr[5]/td[2]")).shouldHave(text("02 December,1991"));
        $(byXpath("//tbody/tr[6]/td[2]")).shouldHave(text("Arts"));
        $(byXpath("//tbody/tr[7]/td[2]")).shouldHave(text("Music"));
        $(byXpath("//tbody/tr[8]/td[2]")).shouldHave(text("1.jpg"));
        $(byXpath("//tbody/tr[9]/td[2]")).shouldHave(text(client.currentAddress));
        $(byXpath("//tbody/tr[10]/td[2]")).shouldHave(text("NCR Delhi"));
    }
}
