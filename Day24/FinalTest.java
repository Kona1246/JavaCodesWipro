package Test;
import org.testng.annotations.Test;

import Pages.DEmoLogin;
import Utils.BasetEST;



public class FinalTest extends BasetEST {

@Test


public void validLoginTest() {

DEmoLogin loginPage = new DEmoLogin (driver);

loginPage.login("admin", "admin123");

}

}


