package palindrome;

import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeCheckTest {

    @Test
    public void testPalindrome() {
        assertTrue(PalindromeCheck.checkPalindrome("abba"));
    }

}
