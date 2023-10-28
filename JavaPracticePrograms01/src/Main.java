public class Main {
    public static void main(String[] args) {
        printReverse("Hello World!");
    }
    public static void printReverse(String string){
        char[] array = string.toCharArray();
        for(int i = array.length - 1; i >= 0; i-- ){
            System.out.print(array[i]);

        }
    }
}
