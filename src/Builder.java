public class Builder {
    private User user;

    public Builder() {
        this.user = new User();
    }

    public void buildFirstName(String firstName) {
        user.setFirstName(firstName);
    }

    public void buildLastName(String lastName) {
        user.setLastName(lastName);
    }

    public void buildAge(int age) {
        user.setAge(age);
    }

    public void buildNickName(String nickName) {
        user.setNickName(nickName);
    }

    public void buildPassword(String password) {
        user.setPassword(password);
    }

    public void buildPhoneNumber(int phoneNumber) {
        user.setPhoneNumber(phoneNumber);
    }

    public void buildGender(String gender) {
        user.setGender(gender);
    }

    public User getUser() {
        return user;
    }
}
