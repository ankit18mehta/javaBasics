public class SpeedConvertor {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour)==-1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-2);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

        System.out.println(toMilesPerHour(1.5));

    }
}
