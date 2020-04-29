package com.CaseStudy;

import java.net.PasswordAuthentication;
import java.util.regex.Pattern;

public class UserMethodTesting {

    private static final String PATTERN = "^[A-Z]{1}[a-z]{3,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";
    

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
    
}


