public class CodilityProblem2 {

    /*
     * Checks if input array is in ascending order starting with 1 and ending with K
     * where the difference between any two adjacent integers in the array is not
     * greater than 1
     *
     * @param array is the input array to be checked
     * @param K is the maximum integer in the array
     *
     * @return true     if input array is in ascending order starting with 1 and
     *                  ending with K where the difference between any two adjacent
     *                  integers in the array is not greater than 1
     *         false    otherwise
     */
    public static boolean isArrayInAscendingOrderWithinRange1ToK(int[] array, int K){
        int lengthOfArray = array.length;
        if(lengthOfArray == 0)
            return false;

        // checking if array is in ascending order and absolute difference between
        // any two adjacent integers is not greater than 1
        for(int indexOfArray = 0; indexOfArray < lengthOfArray-1; indexOfArray++){
            if(!(array[indexOfArray] == array[indexOfArray+1]
                    || array[indexOfArray]+1 == array[indexOfArray+1]))
                return false;
        }

        //return false if array is not starting with 1 and ending with K
        if(array[0] != 1 || array[lengthOfArray-1] != K){
            return false;
        }
        return true;

    }
}
