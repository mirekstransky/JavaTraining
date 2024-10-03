public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }


    public static boolean hasTeen(int first, int second, int third){
        boolean result = false;

        if ((first>=13 && first<=19) || (second>=13 && second<=19) || (third>=13 && third<=19)){
            result = true;
        }else{
            result = false;
        }
        return result;

    }

    public static boolean isTeen(int number){
        boolean result = false;

        if (number>=13 && number<=19){
            result = true;
        }else{
            result = false;
        }
        return result;

    }
}
