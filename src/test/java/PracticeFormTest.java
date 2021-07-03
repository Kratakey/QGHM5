import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;


public class PracticeFormTest extends TestBase {

    PageObject pageObject = new PageObject();

    Faker fake = new Faker(new Locale("en-US"));

    String  firstName = fake.name().firstName(),
            lastName = fake.name().lastName(),
            email = fake.internet().emailAddress(),
            gender = fake.demographic().sex(),
            mobileNumber = fake.number().digits(10),
            year = String.valueOf(fake.number().numberBetween(1950, 2000)),
            month = fake.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            day = String.valueOf(fake.number().numberBetween(1, 28)),
            subject = fake.options().option("English", "Maths", "Physics"),
            address = fake.address().fullAddress(),
            hobbies = fake.options().option("Sports", "Reading", "Music"),
            picture = fake.options().option("gif.jpg", "jpg.jpg", "png.jpg"),
            state = "NCR",
            city = "Delhi";

    @Test
    void successfulSubmitFormTest() {

        pageObject.openPage();

        pageObject.fillFirstName(firstName);
        pageObject.fillLastName(lastName);
        pageObject.fillEmail(email);
        pageObject.selectGender(gender);
        pageObject.fillMobileNumber(mobileNumber);
        pageObject.fillDateOfBirth(year, month, day);
        pageObject.selectSubject(subject);
        pageObject.selectHobbies(hobbies);
        pageObject.uploadPicture(picture);
        pageObject.fillAddress(address);
        pageObject.selectState(state);
        pageObject.selectCity(city);

        pageObject.clickSubmit();

        pageObject.testRegistrationForm(
                firstName,
                lastName,
                email,
                gender,
                mobileNumber,
                day,
                month,
                year,
                subject,
                hobbies,
                picture,
                address,
                state,
                city);



    }

}
