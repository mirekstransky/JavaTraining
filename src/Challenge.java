public class Challenge {
    public static void main(String[] args) {

    displayHighScorePosition("Tom",calculateHighScorePosition(1500));
    displayHighScorePosition("Tom",calculateHighScorePosition(1000));
    displayHighScorePosition("Tom",calculateHighScorePosition(500));
    displayHighScorePosition("Tom",calculateHighScorePosition(100));
    displayHighScorePosition("Tom",calculateHighScorePosition(25));

    }
    public static void displayHighScorePosition(String name,int position){
        System.out.println(name + " managed to get into " + position + " on the high score list!");
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score>=100) {
            return 3;
        }else {
            return 4;
        }

    }
}
