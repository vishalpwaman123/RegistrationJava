package com.CaseStudy;

import java.net.PasswordAuthentication;
import java.util.regex.Pattern;

public class UserMethodTesting {

    private static final String PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";
    private static final String MOBILE_PATTERN = "^([0-9]{2}[ ])?([1-9]{1}[0-9]{9})$";
    private static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.[@#$%!]).{8,})";
    private static final String ALLEMAIL_PATTERN = "^[a-zA-Z0-9]{3,}@[a-z.]+[a-z]{2,}$";

    public String validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(PATTERN);
        if( pattern.matcher(fname).matches() == true)
        {
            return "True";
        }else
        {
            return "False";
        }
    }

    public String validateLastName(String lname) {
        Pattern pattern = Pattern.compile(PATTERN);


        if( pattern.matcher(lname).matches() == true)
        {
            return "True";
        }else
        {
            return "False";
        }
    }

    public String validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);

        if( pattern.matcher(email).matches() == true)
        {
            return "True";
        }else
        {
            return "False";
        }
    }

    public String validateMobileNumber(String mobile) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        if( pattern.matcher(mobile).matches() == true)
        {
            return "True";
        }else {
            return "False";
        }
    }

    public String validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

        if( pattern.matcher(password).matches() == true)
        {
            return "True";
        }else {
            return "False";
        }
    }

    public String validateAllEmailAddress(String email) {
        Pattern pattern = Pattern.compile(ALLEMAIL_PATTERN);

        if( pattern.matcher(email).matches() == true)
        {
            return "True";
        }else
        {
            return "False";
        }
    }
}


