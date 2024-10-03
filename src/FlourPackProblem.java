public class FlourPackProblem {
    public static void main(String[] args) {
//        System.out.println(canPack (1, 5, 9)); //true
//
//        System.out.println(canPack (1, 0, 4)); //false
//        System.out.println(canPack (1, 0, 5)); //true
//        System.out.println(canPack (0, 5, 4)); //true
//        System.out.println(canPack (2, 2, 11)); //true
//        System.out.println(canPack (-3, 2, 12)); //false
//
//        System.out.println(canPack(4, 18, 19));//true
        System.out.println( canPack(6, 2, 17));//true
    }

    public static boolean canPack(int bigCount ,int smallCount ,int goal){
        if (bigCount < 0 || smallCount < 0) return false;
        if ((bigCount * 5 + smallCount * 1) < goal) return false;

        int rest = 0;
        if (bigCount * 5 > goal) {
            rest = goal / 5;
            if ((rest*5+smallCount)>= goal){
                return true;
            }else {
                return false;
            }
        }
        return true;
    }


}
