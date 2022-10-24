import com.andersenlab.lesson11.main.SquareFinder;
import org.junit.Assert;
import org.junit.Test;

public class FindSquareTest {
    SquareFinder squareFinder = new SquareFinder();

    @Test
    public void checkSquareTest() {
        int a = 4;
        int b = 5;
        int c = 6;
        double expectedSquare = 6.48074069840786;
        double actualSquare = squareFinder.findSquare(a, b, c);

        Assert.assertEquals(expectedSquare, actualSquare, 0.000001);
    }

    @Test
    public void checkCorrectInputTest() {
        int a = 4;
        int b = 5;
        int c = 6;
        boolean actualResult = squareFinder.checkInput(a, b, c);

        Assert.assertTrue(actualResult);

    }

    @Test
    public void checkIncorrectInputTest() {
        int a = 4;
        int b = -5;
        int c = 6;
        boolean actualResult = squareFinder.checkInput(a, b, c);

        Assert.assertFalse(actualResult);

    }
}
