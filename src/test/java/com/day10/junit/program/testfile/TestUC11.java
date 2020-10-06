package com.day10.junit.program.testfile;

import com.day10.junit.program.UserRegistration;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.lang.reflect.ParameterizedType;
@RunWith(Parameterized.class)

public class TestUC11 {
    private UserRegistration ur;
    private String email;
    private boolean expRes;

    @Before
    public void initialize() {
        ur = new UserRegistration();
    }

    public TestUC11(String email, boolean expRes) {
        this.email=email;
        this.expRes=expRes;
    }
    @Parameterized.Parameters
    public static Collection inputEmails(){
        return Arrays.asList(new Object[][] { {"abc@gmail.com",true},{"abc-100@gmail.com",true},{"abc.100@gmail.com",true},
                {"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@gmail.com.au",true},{"abc@1.com",true},
                {"abc@gmail.com.com",true},{"abc+100@gmail.com",true},{"abc",false},
                {"abc@.com.my",false},{"abc123@gmail.a"false},{"abc123@.com",false},{"abc123@.com.com",false},
                {".abc@abc.com",false},{"abc()*@abc.com",false},{".abc@!#$.com",false},{"abc..2002@abc.com",false},
                {"abc.@abc.com",false},{"abc@abc@abc.com",false},{".abc@abc.com",false},{"abc@abc.com.1a",false},
                {"abc@abc.com.aa.au",false}});
    }

    @Test
    public void parameterizedWayOfEmailValidation() {
        System.out.println("Parameterized Email is: "+ email);
        Assert.assertEquals(expRes,ur.email(email));
    }

}
