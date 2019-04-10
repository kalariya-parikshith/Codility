import org.junit.Assert;
import org.junit.Test;

public class CodilityProblem2Test {
    @Test
    public void test1(){
        int[] inputArray = {1, 1, 2, 3, 3};
        int inputK = 3;
        boolean actualResult =
                CodilityProblem2.isArrayInAccendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void test2(){
        int[] inputArray = {1, 1, 3};
        int inputK = 3;
        boolean actualResult =
                CodilityProblem2.isArrayInAccendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void test3(){
        int[] inputArray = {1, 1, 3};
        int inputK = 2;
        boolean actualResult =
                CodilityProblem2.isArrayInAccendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void test4(){
        int[] inputArray = {1};
        int inputK = 2;
        boolean actualResult =
                CodilityProblem2.isArrayInAccendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void test5(){
        int[] inputArray = {1};
        int inputK = 1;
        boolean actualResult =
                CodilityProblem2.isArrayInAccendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void test6(){
        int[] inputArray = {};
        int inputK = 1;
        boolean actualResult =
                CodilityProblem2.isArrayInAccendingOrderWithinRange1ToK(inputArray, inputK);
        Assert.assertEquals(false, actualResult);
    }
}
