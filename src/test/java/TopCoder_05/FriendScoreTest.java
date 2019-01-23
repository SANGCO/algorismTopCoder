package TopCoder_05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendScoreTest {

    private FriendScore friendScore;

    @Before
    public void setUp() {
        this.friendScore = new FriendScore();
    }

    @Test
    public void case_01() {
        String[] friends =  {"NNN",
                             "NNN",
                             "NNN"};
        assertEquals(friendScore.highestScore(friends), 0);
    }

    @Test
    public void case_02() {
        String[] friends =  {"NYY",
                             "YNY",
                             "YYN"};
        assertEquals(friendScore.highestScore(friends), 2);
    }

    @Test
    public void case_03() {
        String[] friends =  {"NYNNN",
                             "YNYNN",
                             "NYNYN",
                             "NNYNY",
                             "NNNYN"};
        assertEquals(friendScore.highestScore(friends), 4);
    }

}