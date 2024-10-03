public class LeapYearCalculator {
    public static void main(String[] args) {


        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }


    public static boolean isLeapYear(int yeap){
        boolean result = false;
        if (yeap < 1 || yeap > 9999){
            return false;
        }
        if ((yeap % 4) == 0){
            //STEP 2
            if( ( yeap % 100 ) == 0 ){
                //STEP 3
                if( ( yeap % 400 ) == 0 ){
                    //STEP 4
                    result = true;
                }else {
                    //STEP 5
                    result = false;
                }
            }else {
                //STEP4
                result = true;
            }
        }else {
            //STEP 5
            result = false;
        }
        return result;
    }
}
