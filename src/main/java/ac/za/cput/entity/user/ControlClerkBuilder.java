package ac.za.cput.entity.user;

public class ControlClerkBuilder {
    private String clerkId;
    private String universityId, surname, firstName, phoneNum, emailAddress, password;

    protected ControlClerkBuilder(){}

    private ControlClerkBuilder(Builder builder) {
        this.clerkId = builder.clerkId;
        this.universityId = builder.universityId;
        this.surname = builder.surname;
        this.firstName = builder.firstName;
        this.phoneNum = builder.phoneNum;
        this.emailAddress = builder.emailAddress;
        this.password = builder.password;
    }

    public String getClerkId() {
        return clerkId;
    }

    public String getUniversityId() {
        return universityId;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ControlClerk{" +
                "clerkId='" + clerkId + '\'' +
                ", universityId='" + universityId + '\'' +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String clerkId, universityId, surname, firstName, phoneNum, emailAddress, password;

        public Builder setClerkId(String clerkId) {
            this.clerkId = clerkId;
            return this;
        }

        public Builder setUniversityId(String universityId) {
            this.universityId = universityId;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(ControlClerkBuilder controlClerkBuilder){
            this.clerkId = controlClerkBuilder.clerkId;
            this.universityId = controlClerkBuilder.universityId;
            this.surname = controlClerkBuilder.surname;
            this.firstName = controlClerkBuilder.firstName;
            this.phoneNum = controlClerkBuilder.phoneNum;
            this.emailAddress = controlClerkBuilder.emailAddress;
            this.password = controlClerkBuilder.password;
            return this;
        }

        public ControlClerkBuilder build(){
            return new ControlClerkBuilder(this);
        }
    }

}
