package javabasics.eleazer;

/*
Insertion sort algorithm
 */



/*
STABLE SORT - Relative ordering of duplicate items is preserved [preferable]
UNSTABLE SORT - Relative ordering of duplicate items is not preserved.
 */
public class InsertionSort {

    public static int[] insertionSortFunction(int[] intArray){
        int[] array = intArray;
        for(int firstUnsortedIndex = 1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
            int item = array[firstUnsortedIndex];

            int i = 0;
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > item; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = item;
        }

        return intArray;
    }

    public static void main(String[] args){
        int[] intArray = {4,-2,45, 23, 45, 32, 12, 17, 19, 20, 67, 58, 90};
        insertionSortFunction(intArray);
        for(int num: intArray){
            System.out.print(num + " ");
        }


    }



}
