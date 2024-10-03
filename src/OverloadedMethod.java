public class OverloadedMethod {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(1,5));
        System.out.println(convertToCentimeters(2,8));
        System.out.println(convertToCentimeters(0,5));
        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(5));


    }

    public static double convertToCentimeters(int height){
        return height * 2.54;
    }
    public static double convertToCentimeters(int foot, int inches){
        return convertToCentimeters(foot * 12 + inches);
    }

}
