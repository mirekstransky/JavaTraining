public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println(sumDigits(225));
    }

    public static int sumDigits(int number){
        int rest = 0;

        while (true){
            rest += number % 10;
            number /= 10;
            if (number == 0) break;
        }
        return rest;
    }

}
