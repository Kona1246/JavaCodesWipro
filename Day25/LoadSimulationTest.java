package Day_25;
import org.testng.annotations. Test;

public class LoadSimulationTest {

@Test(invocationCount = 6, threadPoolSize = 3)

public void simulateUserAction() {

long threadId = Thread.currentThread().getId();

System.out.println("Executing test on Thread ID: " +threadId);

}


}
