import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }


    public static void inputThenPrintSumAndAverage(){

        Scanner scan = new Scanner(System.in);
        int value;
        int iterace = 0;
        int sum = 0;
        long average;

        while(true){
            try{
               //System.out.println("Zadejte hodnotu:");
               value = Integer.parseInt(scan.nextLine());
               //System.out.println(value);
               sum += value;
            }catch (NumberFormatException e){
                //System.out.println("Invalid Value");
                break;
            }
            iterace++;
        }
        if (iterace > 0 ) {
            average = Math.round((double) sum / iterace);
            System.out.println(average);
        }else{
            average = 0;
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
