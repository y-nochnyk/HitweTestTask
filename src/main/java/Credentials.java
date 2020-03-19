import com.github.javafaker.Faker;

class Credentials {
    private static Faker faker = new Faker();

    static String getUsername(){
        return faker.name().username();
    }

    static String getEmail(){
        return faker.name().firstName() + "@testmail.com";
    }
}
