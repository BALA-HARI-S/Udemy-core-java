public class Main {

    public static void main(String[] args) {

        System.out.println("Coding Exercise 1: Positive Negative or Zero");
        PositiveNegativeZero.checkNumber(10);

        System.out.println("\nCoding Exercise 2: Speed Converter");
        SpeedConverter.printConversion(5.5);

        System.out.println("\nCoding Exercise 3:  MegaBytes Converter");
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        System.out.println("\nCoding Exercise 4:  Barking Dog : " +
                BarkingDog.shouldWakeUp(true, 9));


        System.out.println("\nCoding Exercise 5:  Leap Year : "
                + LeapYear.isLeapYear(2024) + "\n");


        System.out.println("Coding Exercise 6: DecimalComparator : " +
                DecimalComparator.areEqualByThreeDecimalPlaces(2.567,2.6651));

        System.out.println("\nCoding Exercise 7: EqualSumChecker : " +
                EqualSumChecker.hasEqualSum(2,2,4));

        System.out.println("\nCoding Exercise 8: TeenNumberChecker \nhasTeen : " +
                TeenNumberChecker.hasTeen(13, 16, 20) + "\nisTeen : " +
                TeenNumberChecker.isTeen(15));

        System.out.println("\nCoding Exercise 9: Area Calculator : " +
                AreaCalculator.area(5.5) +
                AreaCalculator.area(2.5,3));

        System.out.println("\nCoding Exercise 10: Minutes To Years Days Calculator");
        MinutesToYearsDaysCalculator.printYearsAndDays(500000);

        System.out.println("\nCoding Exercise 11: IntEqualityPrinter");
        IntEqualityPrinter.printEqual(5,4,5);

        System.out.println("\nCoding Exercise 12: PlayingCat : " +
                PlayingCat.isCatPlaying(true, 40));


    }
}
