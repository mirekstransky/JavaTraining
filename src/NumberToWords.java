public class NumberToWords {
    public static void main(String[] args) {

        numberToWords(0);
        System.out.println("----");
        numberToWords(123);
        System.out.println("----");
        numberToWords(1010);
        System.out.println("----");
        numberToWords(1000);
        System.out.println("----");
        numberToWords(-12);
        System.out.println("----");
        numberToWords(4);

        System.out.println("Chyba...");
        System.out.println(getDigitCount(-37273));

    }


    public static void numberToWords(int number){
        if (number < 0) System.out.println("Invalid Value");
        int lastDigit;

        int reverseNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int digitCountReverse = getDigitCount(reverseNumber);

        do {

            lastDigit = reverseNumber % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
            }
            reverseNumber /= 10;

        }while (reverseNumber != 0);

        for (int i = 0; i < digitCount -digitCountReverse; i++) {
            System.out.println("ZERO");
        }
    }

    public static int reverse(int number){

        int lastNumber;
        int reverseNumber = 0;

        while (number != 0 ){
            lastNumber = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        int iterace = 0;
        if (number<0){
            return -1;
        } else if (number==0) {
            return 1;
        }
        while (number!=0){

            iterace++;
            number /= 10;
        }
        return iterace;
    }
}
