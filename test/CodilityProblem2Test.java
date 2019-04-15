import org.junit.Assert;
import org.junit.Test;

public class CodilityProblem2Test {
    @Test
    public void arrayInOrder(){
        int[] inputArray = {1, 1, 2, 3, 3};
        int inputK = 3;
        boolean actualResult =
                CodilityProblem2.isArrayInAscendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void missingOneIntegerInTheMiddleOfTheArray(){
        int[] inputArray = {1, 1, 3};
        int inputK = 3;
        boolean actualResult =
                CodilityProblem2.isArrayInAscendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void maximumValueExceedsK(){
        int[] inputArray = {1, 1, 3};
        int inputK = 2;
        boolean actualResult =
                CodilityProblem2.isArrayInAscendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertFalse( actualResult);
    }

    @Test
    public void arrayLengthOneWithMaxValueInArrayLessThanK(){
        int[] inputArray = {1};
        int inputK = 2;
        boolean actualResult =
                CodilityProblem2.isArrayInAscendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void arrayLengthOneWithMaxValueInArrayEqualsK(){
        int[] inputArray = {1};
        int inputK = 1;
        boolean actualResult =
                CodilityProblem2.isArrayInAscendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void emptyArray(){
        int[] inputArray = {};
        int inputK = 1;
        boolean actualResult =
                CodilityProblem2.isArrayInAscendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertFalse(actualResult);
    }
}
