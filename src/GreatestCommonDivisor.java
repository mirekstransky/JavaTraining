public class GreatestCommonDivisor {
    public static void main(String[] args) {



        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }


    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10 ) return -1;

        int i = 1;
        int greatestNumber = 0;
        while (i <= first || i <= second){
            if (first % i == 0 && second % i == 0){
                greatestNumber = i;
            }
            i++;
        }
        return greatestNumber;
    }



}
