import org.junit.jupiter.api.Test;


public class Registration extends BrowserInit {

    Methods methods = new Methods();

    @Test
    void successfulSubmitFormTest() {

        methods.openPage();

        methods.fillFirstName();
        methods.fillLastName();
        methods.fillEmail();
        methods.selectGender();
        methods.fillNumber();
        methods.fillDateOfBirth();
        methods.selectSubject();
        methods.selectHobbies();
        methods.uploadPicture();
        methods.fillAddress();
        methods.selectState();
        methods.selectCity();

        methods.clickSubmit();

        methods.testRegistrationForm();



    }

}
