package com.CaseStudy;

import java.net.PasswordAuthentication;
import java.util.regex.Pattern;

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
}


