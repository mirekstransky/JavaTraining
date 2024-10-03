import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bonus = 200;


        System.out.println(calculateScore(true,levelComplete,bonus));



    }
    public static int calculateScore(boolean gameOver,int levelComplete, int bonus){
        int finalScore = 0;
        if (gameOver){
            finalScore += (levelComplete * bonus);
            return finalScore;
        }
        return 0;
    }
}