public class CodilityProblem2 {
    public static boolean isArrayInAccendingOrderWithinRange1ToK(int[] array, int K){
        int lengthOfArray = array.length;
        if(lengthOfArray == 0)
            return false;
        for(int indexOfArray = 0; indexOfArray < lengthOfArray-1; indexOfArray++){
            if(!(array[indexOfArray] == array[indexOfArray+1]
                    || array[indexOfArray]+1 == array[indexOfArray+1]))
                return false;
        }

        if(array[0] != 1 || array[lengthOfArray-1] != K){
            return false;
        }
        return true;

    }
}
