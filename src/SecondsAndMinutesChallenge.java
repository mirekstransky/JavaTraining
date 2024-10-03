public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        getDurationString(500);

    }

    public static void getDurationString(int second){
        getDurationString(second / 60,second % 60);
    }

    public static void getDurationString(int minutes,int second){
        int hour = minutes / 60;
        minutes = minutes % 60;
        System.out.println(hour + " hours " + minutes + " minutes " + second + " seconds");

    }



}
