public class Main {
    public static void main(String[] args) {
        for (int i=0; i <= 5; i++){
            Student s = new Student("s9001"+i,
                    switch (i){
                        case 1 -> "karthi";
                        case 2 -> "Hari";
                        case 3 -> "bala";
                        case 4 -> "Logesh";
                        case 5 -> "Harish";
                        default -> "Anonymous";
                    },
                    "19/08/2002",
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}
