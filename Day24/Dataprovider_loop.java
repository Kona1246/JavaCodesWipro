package Day_24;


import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;



public class Dataprovider_loop {

@DataProvider(name = "loginData")

public Object[][] getData() {

int size= 3; // number of iterations you want

Object[][] data = new Object[size][2]; // 2 columns: username & password

for (int i=0; i < size; i++) {

data[1][0] = "admin";

// username

data[i][1] = "admin123";

// password

}

return data;

}

@Test(dataProvider = "loginData")




public void loginTest(String username, String password) {

System.out.println("Running test with: + username + " +password);

}

}
