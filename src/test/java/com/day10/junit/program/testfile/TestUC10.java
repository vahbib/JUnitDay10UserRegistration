package com.day10.junit.program.testfile;

import com.day10.junit.program.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUC10 {
    UserRegistration ur= new UserRegistration();

    @Test
    public void fNValidation() {
        Assert.assertTrue(ur.firstName("Bibhav"));
    }
    @Test
    public void lNValidation() {
        Assert.assertTrue(ur.lastName("Singh"));
    }
    @Test
    public void emailValidation() {
        Assert.assertTrue(ur.email("singh.bibhav@nitt.edu"));
    }
    @Test
    public void mobileValidation() {
        Assert.assertTrue(ur.mobile("91 8547863241"));
    }
    @Test
    public void passwordValidation() {
        Assert.assertTrue(ur.password("Dsaddq@4535"));
    }
    @Test
    public void givenString_whenEntered_shouldReturnSad() {
        Assert.assertEquals("Sad",ur.happySad("Sad"));
    }

}
