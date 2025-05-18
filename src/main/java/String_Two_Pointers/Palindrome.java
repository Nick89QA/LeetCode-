package String_Two_Pointers;



public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome(); // инициализация
        boolean result = p.isPalindrome("A man, a plan, a canal: Panama");

        System.out.println(" Это палиндром? " + result);
    }
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;//обход строки с двух сторон

            while (left < right) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++; // двигаемся по строке
                }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
             right --; // двигаемся по строке

            }
        }

    }
}