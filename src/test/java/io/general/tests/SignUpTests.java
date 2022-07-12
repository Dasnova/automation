package io.general.tests;

import org.junit.Before;
import allpages.Common;
import allpages.SignUpPage;
import org.junit.Test;

import java.io.IOException;

import static io.general.base.Browser.closeBrowser;


public class SignUpTests {

    SignUpPage registration = new SignUpPage();
    Common common = new Common();
    @Test

    public void signUpOrg() throws IOException {
    common.visit();
    // registration.setFirstName().setLastName().setEmail().setEmailConfirmation().setPassword().readMessage();

  }



}

