import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};


        for(int i : ar){
            System.out.println(i);
        }

//      New Array object

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter values : ");
//        int num = scan.nextInt();
        String values = scan.nextLine();
        String[] inputValues = values.split(" ");
        int[] numbers = new int[inputValues.length];

//        int i =0;
//        while( i < numbers.length) {
//            numbers[i] = scan.nextInt();
//            i++;
//        }

//        System.out.print("You Entered : ");
//        for(int j : numbers){
//            System.out.print(j + " ");
//        }

        System.out.print("Odd Numbers : ");
        for(int j : numbers){
            if (j%2 == 1) {
                System.out.print(j + " ");
            }
        }
    }
}
