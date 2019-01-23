package TopCoder_05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThePalindromeTest {

    private ThePalindrome thePalindrome;

    @Before
    public void setUp() {
      thePalindrome = new ThePalindrome();
    }

    @Test
    public void case_01() {
      assertEquals(thePalindrome.find("abab"), 5);
    }

    @Test
    public void case_02() {
        assertEquals(thePalindrome.find("abacaba"), 7);
    }

    @Test
    public void case_03() {
        assertEquals(thePalindrome.find("qwerty"), 11);
    }

    @Test
    public void case_04() {
        assertEquals(thePalindrome.find("abdfhdyrbdbsdfghjkllkjhgfds"), 38);
    }

    @Test
    public void case_05() {
        assertEquals(thePalindrome.find("abcfff"), 9);
    }


}