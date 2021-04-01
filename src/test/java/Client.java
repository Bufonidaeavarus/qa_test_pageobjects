import com.github.javafaker.Faker;

public class Client {
    String firstName;
    String lastName;;
    String email;
    String userNumber;
    String gender;
    String currentAddress;
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
