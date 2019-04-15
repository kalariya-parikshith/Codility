import java.util.Arrays;

public class MinimumAdjacentDifference {
    /*
     * This function is used to get minimum absolute difference between two
     * integers in the array
     *
     * @param   lengthOfArray gives the length of the given array
     * @param   array is the input array whose minimum absolute difference between
     *          two integers is to be calculated
     *
     * @return  minimum absolute difference between two integers in the array
     *          -1 if difference is greater than 100000000
     *          -2 if there is no minimum difference
     */
    public static int getMinimumAdjacentDifference(int lengthOfArray, int[] array){
        Arrays.sort(array);

        int minimumDifference = Integer.MAX_VALUE;
        for(int indexOfArray = 0; indexOfArray < lengthOfArray-1; indexOfArray++){
            int differenceBetweenAdjacent =
                    Math.abs(array[indexOfArray] - array[indexOfArray+1]);

            if(minimumDifference > differenceBetweenAdjacent){
                minimumDifference = differenceBetweenAdjacent;
            }
        }

        if(minimumDifference == Integer.MAX_VALUE)
            return -2;
        if(minimumDifference > 100000000)
            return -1;
        return minimumDifference;
    }
}
