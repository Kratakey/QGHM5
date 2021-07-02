import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class Methods {

    Generated generated = new Generated();

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public void fillFirstName() {
        $("#firstName").setValue(generated.firstName);
    }

    public void fillLastName() {
        $("#lastName").setValue(generated.lastName);
    }

    public void fillEmail() {
        $("#userEmail").setValue(generated.email);
    }

    public void selectGender() {
        $(byText(generated.gender)).click();
    }

    public void fillNumber() {
        $("#userNumber").setValue(generated.number);
    }

    public void fillDateOfBirth() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption(generated.year);
        $(".react-datepicker__month-select").selectOption(generated.month);
        $x(String.format("//*[contains(@aria-label,'%s %sth, %s')]", generated.month, generated.day, generated.year)).click();
    }

    public void selectSubject() {
        $("#subjectsInput").setValue(generated.subject).pressEnter();
    }

    public void selectHobbies() {
        $("#hobbiesWrapper").$(byText(generated.hobbies)).click();
    }

    public void uploadPicture() {
        $("input#uploadPicture").uploadFile(new File("src/test/resources/"+generated.picture));
    }

    public void fillAddress() {
        $("#currentAddress").setValue(generated.address);
    }

    public void selectState() {
        $("#state").click();
        $("#state").$(byText(generated.state)).click();
    }

    public void selectCity() {
        $("#city").click();
        $("#city").$(byText(generated.city)).click();
    }

    public void clickSubmit() {
        $("#submit").click();
    }

    public void testRegistrationForm() {
        $("tbody").shouldHave(text(generated.firstName+" "+generated.lastName),
                text(generated.email),
                text(generated.gender),
                text(generated.number),
                text(generated.day+" "+generated.month+","+generated.year),
                text(generated.subject),
                text(generated.hobbies),
                text(generated.picture),
                text(generated.address),
                text(generated.state),
                text(generated.city)
        );
    }

}
