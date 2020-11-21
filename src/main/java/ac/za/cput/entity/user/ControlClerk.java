package ac.za.cput.entity.user;

import ac.za.cput.entity.generic.University;

public class ControlClerk{

    private String surname, firstName, phoneNum, emailAddress, address, province, password;
    University university;

    private ControlClerk(){}

    public ControlClerk(University university, String surname, String firstName, String phoneNum, String emailAddress,
                                                   String address, String province, String password) {
        this.surname = surname;
        this.firstName = firstName;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
        this.password = password;
        this.address = address;
        this.province = province;
        this.university = university;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
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
