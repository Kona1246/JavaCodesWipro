package OrangeHRM;


import org.testng.annotations.Test;

public class SmokeTests {

    @Test(groups = "smoke")
    public void basicNavigationTest() {
        System.out.println("Smoke Test: Basic navigation check.");
    }
}

