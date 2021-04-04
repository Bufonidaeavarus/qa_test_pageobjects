package testdata;

import com.github.javafaker.Faker;

public class Client {
    public String firstName;
    public String lastName;;
    public String email;
    public String userNumber;
    public String gender;
    public String currentAddress;
    public Client(){
        Faker faker = new Faker();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        email = faker.internet().emailAddress();
        userNumber =  faker.phoneNumber().subscriberNumber(10);
        gender = "Male";
        currentAddress = faker.address().fullAddress();
    }

}
