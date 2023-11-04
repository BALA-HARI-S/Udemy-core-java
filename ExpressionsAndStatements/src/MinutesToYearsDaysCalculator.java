public class MinutesToYearsDaysCalculator {

    private static int minPerHour = 60;

    private static int hoursPerDay = 24;

    private static int daysPerYear = 365;

    private static int minPerDay = hoursPerDay * minPerHour;

    private static int minPerYear = minPerHour * hoursPerDay * daysPerYear;

    public static void printYearsAndDays(long minutes){

        if (minutes < 0){

            System.out.println("Invalid Value");
            return;
        }




        long year = minutes / minPerYear;

        long day = (minutes / minPerDay) % daysPerYear;

        System.out.println( minutes+ " min = " + year + " y and " + day + " d");

    }

}