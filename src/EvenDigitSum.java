public class EvenDigitSum {
    public static void main(String[] args) {


        System.out.println(getEvenDigitSum(123456789)); //20
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }



    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;
        int sum = 0;
        int lastNumber = 0;

        while (number != 0){
            lastNumber = number % 10;
            if (lastNumber % 2 == 0) {
                sum += lastNumber;
            }
            number /= 10;
        }
        return sum;
    }
}
