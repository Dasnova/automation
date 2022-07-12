package allpages;

import org.openqa.selenium.By;

public class SignUpPage extends BaseObj <SignUpPage> {

    private By firstNameFld =  By.id("firstname");
    private By lastNameFld = By.id("lastname");
    private By emailFld = By.id("email");
    private By confirmEmailFld = By.id("confirmEmail");
    private By createPassword = By.id("createPassword");
    private By createPasswordFld = By.id("password");
    private By nextBtn = By.id(".button");
    private  By nextTxt = By.cssSelector(".text-button");

    public SignUpPage setFirstName() {
        setText(firstNameFld, "zol");
        return this;
    }

    public SignUpPage setLastName() {
        setText(lastNameFld, "alex");
        return this;
    }

    public SignUpPage setEmail() {
        setText(emailFld, "lex@gmail.com");
        return this;
    }

    public SignUpPage setEmailConfirmation () {
        setText(confirmEmailFld, "lex@gmail.com");
        return this;
    }

    public SignUpPage setPassword () {
        setText(createPasswordFld, "Password123?");
        return this;
    }

    public SignUpPage pressNext () {
        click(nextBtn);
        return this;
    }

    public SignUpPage readMessage(){
        getText("Next", nextTxt);
        return this;
    }

//    public SignUpPage readMessage(){
//        getPageTitle("Signup");
//        return this;
    }

