public class LargestPrime {

    public static void main(String[] args) {
          getLargestPrime (21);
            System.out.println(getLargestPrime (21));
//        System.out.println(getLargestPrime (217));
//        System.out.println(getLargestPrime (0))
//        System.out.println(getLargestPrime (45));
//        System.out.println(getLargestPrime (-1));
        //getLargestPrime(12);
    }



    public static int getLargestPrime(int wholeNumber){

            for (int i = wholeNumber; i > 2; i--) {
                if (isPrimeNumber(i)){
                    return i;
                }
            }
            return -1;
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
