import java.util.Arrays;

public class MinimumAdjacentDifference {
    public static int getMinimumAdjacentDifference(int lengthOfArray, int[] array){
        Arrays.sort(array);
        int minimumDifference = Integer.MAX_VALUE;
        for(int indexOfArray = 0; indexOfArray < lengthOfArray-1; indexOfArray++){
            int differenceBetweenAdjacent = Math.abs(array[indexOfArray] - array[indexOfArray+1]);
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
