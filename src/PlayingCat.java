public class PlayingCat {
    public static void main(String[] args) {

        //System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        //System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean result = false;
        if (!summer){
            if (temperature>=25 && temperature<=35){
                result = true;
            }else {
                result =false;
            }
        }else {
            if (temperature>=25 && temperature<=45){
                result = true;
            }else {
                result =false;
            }
        }
        return result;
    }
}
