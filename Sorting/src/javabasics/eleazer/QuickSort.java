package javabasics.eleazer;

public class QuickSort {

    public static void main(String[] args){
        int[] arr = {4, 1, 5, 3, 7, -2};
        quickSort(arr, 0, arr.length);
        for(int a:arr){
            System.out.print(a + " ");
        }

    }


    /*
    Quick sort
     */
    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        // This is using the first element as the pivot.

        int pivot = input[start];
        int i = start;
        int j = end;


        while(i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }

            while(i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }


        input[j] = pivot;
        return j;
        }
}
