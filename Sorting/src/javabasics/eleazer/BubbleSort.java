package javabasics.eleazer;

public class BubbleSort {

    public static void main(String[] args){
        int[] intArray = {34,65,2,45,6,21,5,17,83};
        /*
        Testing the method
         */
        BubbleSortFunction(intArray);
    for (int i : intArray) {
        System.out.println(i);
        }

    }


    /*
    Swap Function
     */
    public static void swap(int[] array, int i, int j){
        if(i == j)
        {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }




        /*
        -------------BUBBLE SORT algorithm
        sorting in ascending order.
        STABLE SORT ALGORITHM
         */

    public static int[] BubbleSortFunction(int[] intArray){

        int[] array = intArray;
        

        for( int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --){

            for(int index = 0; index < lastUnsortedIndex; index ++){
                if(array[index] > array[index+1]){
                    swap(array, index, index+1);
                }
            }
        }

return intArray;
    }
}
