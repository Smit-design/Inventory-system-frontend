package ac.za.cput.entity.user;

public class ControlClerk{

    private String surname, firstName, phoneNum, emailAddress, password;

    private ControlClerk(){}

    public ControlClerk(String surname, String firstName, String phoneNum, String emailAddress, String password) {
        this.surname = surname;
        this.firstName = firstName;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ControlClerk{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
