public class EqualSumChecker {
    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }


    public static boolean hasEqualSum(int first,int second, int third){
        boolean result = false;

        if ((first + second)==third){
            result = true;
        }else{
            result = false;
        }

        return result;
    }
}
