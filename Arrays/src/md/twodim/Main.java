package md.twodim;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[4][4];


        for(var outer : array){
            for (var element : outer){
                System.out.print(element);
            }
            System.out.println();
        }

        System.out.println("for loop");
        for (int i = 0; i < array.length; i++){
            var innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++){
//                System.out.print(array[i][j] + " ");
                array[i][j] = (i * 10) + (j+2);
            }
//            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }


}
