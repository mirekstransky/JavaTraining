package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[13];
        array = getIntegers(array.length);
        array = sortIntegers(array);
        //printArray(array);

    }

    public static int[] getIntegers(int number){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d\n",i,array[i]);
        }
    }

   public static int[] sortIntegers(int[] array) {
        int velikostPole = array.length;
        int[] newArray = Arrays.copyOf(array,velikostPole);
        Arrays.sort(newArray);

        System.out.println(Arrays.toString(newArray));

        int temp = 0;

        for (int i = 0; i < array.length/2; i++) {
            temp = newArray[i];
            newArray[i] = newArray[newArray.length-i-1];
            newArray[newArray.length-1-i] = temp;
       }
        return newArray;
   }
}
