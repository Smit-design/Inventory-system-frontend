package ac.za.cput.entity.user;
/*
 *@author @joselledina
 * Description: Entity for  Login
 * Date: 28 June 2020
 */

import java.io.Serializable;

public class Login implements Serializable {
    private String loginId;
    private  String emailAddress;
    private int password;

    private Login() {
    }

    public Login(String loginId, String emailAddress, int password) {
        this.loginId = loginId;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "loginId='" + loginId + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password=" + password +
                '}';
    }
}


