package TopCoder_04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThePalindrome2Test {

    private ThePalindrome2 thePalindrome;

    @Before
    public void setUp() {
        thePalindrome = new ThePalindrome2();
    }

    @Test
    public void case_01() {
        assertEquals(thePalindrome.solution("abcdcba"), 7);
    }

    @Test
    public void case_02() {
        assertEquals(thePalindrome.solution("abacde"), 3);
    }

}