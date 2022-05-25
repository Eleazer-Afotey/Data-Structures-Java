package javabasics.eleazer;

public class CountingSort {

    public static void main (String[] args){
        int[] intArray = {2,4,2,4,1,7,10,9,8,6,3};
        countingSort(intArray,1,10);

        for(int i: intArray){
            System.out.print(i + " ");
        }

    }


    /*
    UNSTABLE
    Linear time algorithm
    in place algorithm
    Algorithm is only effective if the range is greater than the number of
    elements sorted.
     */

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max-min) + 1];

        //count elements in the array
        for(int i = 0; i<input.length; i++){
            countArray[input[i] - min]++;
        }

        int j  = 0;
        for(int i = min; i<= max; i++){
            while(countArray[i-min] > 0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }

}
