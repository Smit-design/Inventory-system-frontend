package ac.za.cput.entity.user;

public class LoginBuilder {
    private String loginId;
    private  String emailAddress;
    private int password;

    private LoginBuilder(){}

    private LoginBuilder(Builder builder){
        this.loginId= builder.loginId;
        this.emailAddress= builder.emailAddress;
        this.password= builder.password;


    }
    public static class Builder{
        private String loginId;
        private String emailAddress;
        private int password;

        public Builder setEmailAddress(final String emailAddress)
        {
            this.emailAddress= emailAddress;
            return this;
        }
        public Builder setPassword(final int password)
        {
            this.password= password;
            return this;
        }
        public Builder setLoginId(final String loginId)
        {
            this.loginId= loginId;
            return this;
        }

        public Builder copy(LoginBuilder loginBuilder){
            this.emailAddress= loginBuilder.emailAddress;
            this.password= loginBuilder.password;
            this.loginId= loginBuilder.loginId;
            return this;
        }
        public LoginBuilder build() {
            return new LoginBuilder(this);
        }

    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getPassword() {
        return password;
    }

    public String getLoginId() {
        return loginId;
    }


    @Override
    public String toString() {
        return "LoginBuilder{" +
                "email_address='" + emailAddress + '\'' +
                ", password=" + password +
                ", login_id="+ loginId +
                '}';
    }
}
