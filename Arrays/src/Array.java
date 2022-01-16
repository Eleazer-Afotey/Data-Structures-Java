//@author Eleazer Afotey

public class Array {

    public static void main(String[] args){

//        creating an int array of length size 7
        int[] intArray = new int[7];


//        using a loop to fill the array

        for (int i = 0; i< intArray.length; i++){
            intArray[i] = 2 * i + 4;
        }

//        using a foreach loop to print contents of the array
        int index = 0;
        for(int num: intArray){
            System.out.println("Element " + index + ": " +  num);
            index += 1;
        }


    }
}
