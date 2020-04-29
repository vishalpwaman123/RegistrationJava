package com.CaseStudy;

import org.junit.Assert;
import org.junit.Test;

public class Usertestor {

    @Test
    public void FirstNameTrue() {
        UserMethodTesting tester=new UserMethodTesting();
        String result = tester.validateFirstName("Vishal");
        Assert.assertEquals("True",result);
    }

    @Test
    public void FirstNameSmallFalse() {
        UserMethodTesting tester=new UserMethodTesting();
        String result = tester.validateFirstName("prabhakar");
        Assert.assertEquals("False",result);
    }

    @Test
    public void FirstNameLessSizeFalse() {
        UserMethodTesting tester = new UserMethodTesting();
        String result = tester.validateFirstName("Rah");
        Assert.assertEquals("False",result);
    }
    @Test
    public void FirstNameSpecialCFalse() {
        UserMethodTesting tester = new UserMethodTesting();
        String result = tester.validateFirstName("Vishal@");
        Assert.assertEquals("False", result);
    }

    //Last Name
    @Test
    public void LastNameTrue() {
        UserMethodTesting tester=new UserMethodTesting();
        String result = tester.validateLastName("Wamankar");
        Assert.assertEquals("True",result);
    }

    //EmailId
    @Test
    public void EmailTrue() {
        UserMethodTesting tester = new UserMethodTesting();
        boolean result = tester.validateEmailAddress("vishalpwaman1997@bridgelabz.com");
        Assert.assertEquals("True",result);
    }

    @Test
    public void EmailNotHaveSpecialSymbolFalse() {
        UserMethodTesting tester = new UserMethodTesting();
        boolean result = tester.validateEmailAddress("vishalpwaman1997bridglabz.com");
        Assert.assertEquals("False",result);
    }

    @Test
    public void EmailInvalidFalse() {
        UserMethodTesting tester = new UserMethodTesting();
        boolean result = tester.validateEmailAddress("vishalpwaman1997@.com");
        Assert.assertEquals("False",result);
    }

}

