import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = randomArray(10);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = Arrays.copyOf(secondArray, secondArray.length);
        Arrays.fill(thirdArray, 2);
        System.out.println(Arrays.toString(thirdArray));

//    Linear or Sequential search - stepping through the
//    element one after another (loop through array)
//    Binary search only works on sorted array

        String[] sArray = {"Hari", "Bala", "Ashok", "Dinesh"};
        Arrays.sort(sArray);
        if (Arrays.binarySearch(sArray, "Hari") >= 0 ){
            System.out.println("Hari was Found!");
        }

        int[] array = getIntegers(5);
        int[] sortedArray = sortIntegers(array);
        System.out.println(Arrays.toString(sortedArray));

    }
    public static int[] randomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
    public static int[] getIntegers(int len){

        Scanner scan = new Scanner(System.in);
        int[] array = new int[len];
        System.out.println("Enter " + len + " integer values:\r");
        for(int i = 0; i < len; i++){
            array[i] = scan.nextInt();
        }

        return array;
    }

    public static int[] sortIntegers(int[] array){

        Arrays.sort(array);
        int[] sortedArray = Arrays.copyOf(array, array.length);

        int i = 0;
        int j = array.length - 1;

        while (i < j){
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[j];
            sortedArray[j] = temp;
            i++;
            j--;
        }

        return sortedArray;
    }

    public static void printArrays(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

}