public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("3200", "AMD",
                "240");
        Monitor theMonitor = new Monitor("24inch", "Samsung",
                24, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("320M", "ASUS",
                4, 6,"v4.02");

        PersonalComputer thePC = new PersonalComputer("3200", "AMD",
                theCase, theMonitor, theMotherboard);

        thePC.powerON();

//        thePC.getComputercase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("Linux OS");
//        thePC.getMonitor().drawPixelAt(10,10,"black");
    }
}
