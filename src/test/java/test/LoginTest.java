package test;

import static org.assertj.core.api.Assertions.*;

import model.User;
import org.testng.annotations.Test;
import page.AlphaIndustriesPages.AccountPage;
import page.AlphaIndustriesPages.LoginPage;
import service.UserCreator;

public class LoginTest extends CommonConditions{
    @Test
    public void userAccessTest(){
        User testUser= UserCreator.withAllProperty();
        LoginPage loginPage= new LoginPage(driver)
                .openPage()
                .inputUserLogin(testUser.getEmail())
                .inputUserPassword(testUser.getPassword())
                .closePrompt();

        AccountPage accountPage = loginPage.clickSubmitButton();

        assertThat(accountPage.getFirstName()).isEqualTo(testUser.getFirstName());
    }
}