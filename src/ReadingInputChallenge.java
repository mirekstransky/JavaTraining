import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingInputChallenge {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String value;
        int number;
        int sum = 0;

        System.out.println("Zadejte 5 čísel ...");

        for (int i = 1; i <=5  ; i++) {
            System.out.println("Zadejte #" + i + " číslo:");

            while (true) {
                try {
                    value = scan.nextLine();
                    number = Integer.parseInt(value);
                    sum += number;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Number, try again !");
                }
            }


        }
        System.out.println("Suma je " + sum);
    }
}
