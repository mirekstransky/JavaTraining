public class FirstLastDigitSum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(21387));
        System.out.println(sumFirstAndLastDigit(5));


//        sumFirstAndLastDigit(252);
//        sumFirstAndLastDigit(257);
//        sumFirstAndLastDigit(0);
//        sumFirstAndLastDigit(5);
//        sumFirstAndLastDigit(-10);

    }


    public static int sumFirstAndLastDigit(int number){
        if (number < 1) return -1;
        int lastDigit = number % 10;
        while (number / 10 != 0){
            number = number / 10;
        }
        return lastDigit + number;
    }
}
