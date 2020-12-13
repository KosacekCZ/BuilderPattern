public class Main {
    public static User createUser() {
    Builder user1 = new Builder();
    user1.buildAge(16);
    user1.buildFirstName("Mikolas");
    user1.buildLastName("Pesek");
    user1.buildGender("male");
    user1.buildNickName("MikolasPeek");
    user1.buildPassword("heslohovnokleslo");
    user1.buildPhoneNumber(725910413);
    return user1.getUser();
    }
}
