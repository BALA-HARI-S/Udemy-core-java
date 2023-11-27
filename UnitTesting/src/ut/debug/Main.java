package ut.debug;

public class Main {
    public static void main(String[] args) {
        var utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while(sb.length() < 10){
            utils.addChar(sb, 'A');
        }
        System.out.println(sb);
    }
}