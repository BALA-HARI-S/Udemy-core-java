public class Main {
    public static void main(String[] args) {
        String bulletInt = "Print Bulleted List :\n" +
                "\t\u2020 First point\n" +
                "\t\t\u2020 Sub point";
        System.out.println(bulletInt);

        String textBlock = """
                Print Bulleted List : 
                    \u2020 First point
                        \u2020 Second point""";
        System.out.println(textBlock);

        int age = 20;
        System.out.printf("your age is %n%d", age);

        String string = "Hello World";
        System.out.printf("%n First char %c",string.charAt(0));
    }
}
