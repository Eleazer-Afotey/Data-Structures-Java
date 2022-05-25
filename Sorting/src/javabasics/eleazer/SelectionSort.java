package javabasics.eleazer;


public class SelectionSort {

    /*Selection Sort Algorithm

     */
    public static int[] selectionSortFunction(int[] intArray){

        int[] array = intArray;

        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex --){

            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
        }

        return intArray;
    }


    /*SWAP Method for selection sort

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


    /*TEST FOR THE METHOD
     */
    public static void main(String[] args){
        System.out.println("This is Quadratic Algorithm O(n^2): \n ");
        int[] arr = {34, 53, -1, 45, 4, 24, 10, 7, 61, 12, 5, 6};
        selectionSortFunction(arr);

        for(int num: arr){
            System.out.print(num + " ");
        }

    }

}
