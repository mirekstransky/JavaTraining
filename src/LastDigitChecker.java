public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
    }


    public static boolean hasSameLastDigit(int first, int second, int third){
        if (!isValid(first) || !isValid(second) || !isValid(third)){
            return false;
        }

        int firstDigit = first % 10;
        int secondDigit = second % 10;
        int thirdDigit = third % 10;

        if ((firstDigit == secondDigit) || (firstDigit == thirdDigit)) {
            return true;
        } else if (secondDigit == thirdDigit) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number){
        if ((number < 10) || (number > 1000)){
            return false;
        }else {
            return true;
        }
    }
}
