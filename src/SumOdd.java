public class SumOdd {
    public static void main(String[] args) {

        System.out.println(isOdd(2));
        System.out.println(isOdd(3));
        System.out.println(isOdd(4));
        System.out.println(isOdd(5));
        System.out.println("///////////");
        System.out.println(sumOdd(1,5));




    }

    public static boolean isOdd(int number) {
        if (number <= 0) return false;
        if (number == 1) {

        } else if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start > end) return -1;
        if ((start <= 0 ) || (end <= 0)) return -1;
        for (int i = start; i <= end; i++) {

            if (isOdd(i)){
                sum += i ;
            }

        }
        return sum;

    }
}
