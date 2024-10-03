public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1001));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){

        if (number<0) {
            number *= -1;        }

        int lastNumber = 0;
        int palindrome = 0;
        int tempNumber = number;

        while (number != 0){
            lastNumber = number % 10;
            number /= 10;
            palindrome = palindrome * 10 + lastNumber;
        }
        return palindrome == tempNumber;
    }
}
