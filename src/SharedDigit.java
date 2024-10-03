public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(92, 99));
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSharedDigit(9, 99));
//        System.out.println(hasSharedDigit(15, 55));



    }
    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if ((firstNum < 10) || (secondNum < 10)){
            return false;
        } else if ((firstNum > 99) || (secondNum > 99)) {
            return false;
        }

        int firstLastNumber = 0;
        int secondLastNumber = 0;

        while (firstNum != 0){

            firstLastNumber = firstNum % 10;
            int secondNumTemp = secondNum;

            while(secondNumTemp != 0){
                secondLastNumber = secondNumTemp % 10;
                if (secondLastNumber == firstLastNumber){
                    return true;
                }
                secondNumTemp /= 10;
            }
            firstNum /= 10;
        }
        return false;
    }



}
