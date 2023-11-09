public class CarriageReturnExample {
    public static void main(String[] args) {
        System.out.print("Loading: 0%");

        // Simulate a progress bar by using \r to return to the start of the line
        for (int i = 1; i <= 10; i++) {
            System.out.print("\rLoading: " + i * 10 + "%");
            try {
                Thread.sleep(500); // Simulate some work being done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Print a newline to move to the next line
    }
}
