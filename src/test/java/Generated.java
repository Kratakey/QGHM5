import com.github.javafaker.Faker;

import java.util.Locale;

public class Generated {
    Faker fake = new Faker(new Locale("en-US"));

    String  firstName = fake.name().firstName(),
            lastName = fake.name().lastName(),
            email = fake.internet().emailAddress(),
            gender = fake.demographic().sex(),
            number = fake.number().digits(10),
            year = String.valueOf(fake.number().numberBetween(1950, 2000)),
            month = fake.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            day = String.valueOf(fake.number().numberBetween(1, 28)),
            subject = fake.options().option("English", "Maths", "Physics"),
            address = fake.address().fullAddress(),
            hobbies = fake.options().option("Sports", "Reading", "Music"),
            picture = fake.options().option("gif.jpg", "jpg.jpg", "png.jpg"),
            state = "NCR",
            city = "Delhi";

}
