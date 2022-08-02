import org.testng.annotations.Factory;

public class FactoryI {
    @Factory()
    public Object[] testFact() {
        return new Object[]{new FactorySample()};
    }
}
