package palindrome;

public class PalindromeCheck {
    private final long id;
    private final String content;

    public PalindromeCheck(long id, String content) {
        this.id = id;
        this.content = content;
    }

    private long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isPalindrome() {
        return checkPalindrome(getContent());
    }

    public String getLongestPalindrome() {
        return findLongestPalindrome(getContent());
    }

    public static boolean checkPalindrome(final String content) {
        return content.equals(new StringBuilder(content).reverse().toString());
    }

    public static String findLongestPalindrome(final String input) {
        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < input.length()) {
                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = input.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }
}
