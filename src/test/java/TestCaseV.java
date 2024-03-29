import org.testng.annotations.Test;

//dependency
public class TestCaseV {
    @Test
    void startCar()
    {
        System.out.println("Car started!");
       // Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car driving!");
    }
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Car stopped!");
    }
    @Test(dependsOnMethods = {"startCar","stopCar","driveCar"},alwaysRun = true )
    void parkCar()
    {
        System.out.println("Car parked!");
    }
}
