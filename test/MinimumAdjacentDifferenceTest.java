import org.junit.Assert;
import org.junit.Test;

public class MinimumAdjacentDifferenceTest {
    @Test
    public void normalTestCase(){
        int lengthOfArray = 8;
        int[] inputArray = {0,3,3,7,5,3,11,1};
        int expectedResult = 0;
        int actualResult =
                MinimumAdjacentDifference.getMinimumAdjacentDifference(lengthOfArray,inputArray);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void arrayWithLengthOne(){
        int lengthOfArray = 1;
        int[] inputArray = {0};
        int expectedResult = -2;
        int actualResult =
                MinimumAdjacentDifference.getMinimumAdjacentDifference(lengthOfArray,inputArray);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void arrayWithLengthZero(){
        int lengthOfArray = 0;
        int[] inputArray = {};
        int expectedResult = -2;
        int actualResult =
                MinimumAdjacentDifference.getMinimumAdjacentDifference(lengthOfArray,inputArray);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void AdjacentDifferenceExceeds10e8(){
        int lengthOfArray = 2;
        int[] inputArray = {-100000000, 100000000};
        int expectedResult = -1;
        int actualResult =
                MinimumAdjacentDifference.getMinimumAdjacentDifference(lengthOfArray,inputArray);
        Assert.assertEquals(expectedResult, actualResult);
    }


}
