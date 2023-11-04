public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        }

        // double milesPerHour = kilometersPerHour * 0.62137;
        // long longValue = (long) milesPerHour;
        // return longValue;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

}
