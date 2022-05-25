package javabasics.eleazer;

public class ShellSort {

    public static void main(String[] args){
        int[] testArray = {5, -5, 6, 56, -42, 45, 112, 55, -1, 5, 0};
        shellSorFunction(testArray);

        for (int num: testArray){
            System.out.print(num + " ");
        }
    }

//    UNSTABLE SORT

    public static int[] shellSorFunction(int[] intArray){

        for(int gap = intArray.length/2; gap > 0; gap /= 2){

            for(int i = gap; i< intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while(j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        return intArray;
    }
}
