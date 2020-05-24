public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((1 <= year) && (year <= 9999)) {
            if (year % 4 == 0 && year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
            }
            return false;

        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(1924));




    }
}
