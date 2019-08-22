import animals.Main;
import org.junit.jupiter.api.Test;

public class MainTests {

    @Test
    public void SmokeTest() {
        Main.main(null);
    }

    @Test
    public void GetAverageEldestTest() {
        Main.getAverageEldestSpecies();
    }
}
