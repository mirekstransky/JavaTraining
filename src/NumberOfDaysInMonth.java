public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println("/////////");

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year){
        if ((year < 1) || (year > 9999)){
            return false;
        }
        if ((year % 4 == 0) && (year % 100 != 0)){
            return true;
        } else if (year % 400 ==0) {
            return true;
        }else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1) || (month > 12)) return -1;
        if ((year < 1) || (year > 9999)) return -1;

        int result = 0;

        switch (month) {
            case 1,3,5,7,8,10,12 -> {
                result = 31;
            }
            case 4,6,9,11 -> {
                result = 30;
            }
            case 2 -> {
                if (isLeapYear(year)){
                    result = 29;
                }else {
                    result = 28;
                }
            }
        }
        return result;
    }
}
