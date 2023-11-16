package comparable;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0,2,4,5,7,9};
        for(Integer i : others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d compareTo = %d%n",five ,val == 0? "==" : (val < 0? "<" : ">"),
                    i ,val);
        }

        String fruit = "banana";
        String[] fruits = {"Apple", "banana", "BANANA"};
        for(String i : fruits){
            int val = fruit.compareTo(i);
            System.out.printf("%s %s %s compareTo = %d%n",fruit ,val == 0? "==" : (val < 0? "<" : ">"),
                    i ,val);
        }

        int A = (int) 'A';
        int b = (int) 'b';
        int B = (int) 'B';
        System.out.println("A : " + A + " b : " + b + " B : " + B);
    }
}
