public class IsPalindrome {

    public boolean checkPalindrom(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        String testWord = "blaalb";
        System.out.println(testWord + " is " + (isPalindrome.checkPalindrom(testWord) ? " a palindrome" : " not a palindrome"));

    }
}
