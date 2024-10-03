public class PrimeNumberChallenge {
    public static void main(String[] args) {

    int number = 10;

    if (isPrimeNumber(number)){
        System.out.println("Je to prvočíslo !");
    }else {
        System.out.println("Není to prvočíslo");
    }

    }


    public static boolean isPrimeNumber(int wholeNumber){

        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0){
                return false;
            }

        }
        return true;
    }
}
