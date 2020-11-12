package ac.za.cput.factory.user;

import ac.za.cput.entity.user.ControlClerkBuilder;

public class ControlClerkFactory {

    public static ControlClerkBuilder createControlClerk(String surname, String firstName,
                                                  String phoneNum, String emailAddress, String password){

        ControlClerkBuilder controlClerkBuilder = null;

        if(surname.trim().equals("")){
            System.out.println("Surname Can't Be Empty");

        }else if(firstName.trim().equals("")){
            System.out.println("Name Can't Be Empty");

        }else if(password.trim().equals("")){
            System.out.println("Password Can't Be Empty");

        }else if(phoneNum.trim().equals("") || phoneNum.trim().length() < 10 || phoneNum.trim().length() > 10
                && emailAddress.trim().equals("")){
            System.out.println("Phone Number or Email doesn't exist");

        }else{
            controlClerkBuilder = new ControlClerkBuilder.Builder()
                    .setSurname(surname.trim())
                    .setFirstName(firstName.trim())
                    .setPhoneNum(phoneNum.trim())
                    .setEmailAddress(emailAddress.trim())
                    .setPassword(password.trim())
                    .build();
        }
        return controlClerkBuilder;
    }
}
