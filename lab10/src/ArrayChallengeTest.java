import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.runners.Enclosed;
import static org.junit.Assert.*;

/**
 * ArrayChallenge Test Cases
 *
 * @author J. Collins, colli206@purdue.edu
 *
 */

@RunWith (Enclosed.class)
public class ArrayChallengeTest {
    private static ArrayChallenge a;

    public static class IncreaseOddValuesTest {

        @Before
        public void setUp() {
            a = new ArrayChallenge();
        }

        @Test(timeout = 100)
        public void test1() {
            int [] temp = {0, 1, 2, 3, 4, 5, 6, 7};
            int [] expected = {0, 2, 2, 4, 4, 6, 6, 8};
            temp = a.increaseOddValues(temp);

            assertArrayEquals(temp, expected);
        }

        @Test(timeout = 100)
        public void test2() {
            int [] temp = {0, 0, 0, 0, 0, 0, 0, 0};
            int [] expected = {0, 0, 0, 0, 0, 0, 0, 0};
            temp = a.increaseOddValues(temp);

            assertArrayEquals(temp, expected);
        }

        @Test(timeout = 100)
        public void test3() {
            int [] temp = {};
            int [] expected = {};
            temp = a.increaseOddValues(temp);

            assertArrayEquals(temp, expected);
        }
    }

    public static class IncreaseOddIndicesTest {

        @Before
        public void setUp() {
            a = new ArrayChallenge();
        }

        @Test(timeout = 100)
        public void test1() {
            int [] temp = {0, 1, 2, 3, 4, 5, 6, 7};
            int [] expected = {0, 2, 2, 4, 4, 6, 6, 8};
            temp = a.increaseOddIndices(temp);

            assertArrayEquals(temp, expected);
        }

        @Test(timeout = 100)
        public void test2() {
            int [] temp = {0, 0, 0, 0, 0};
            int [] expected = {0, 1, 0, 1, 0};
            temp = a.increaseOddIndices(temp);

            assertArrayEquals(temp, expected);
        }

        @Test(timeout = 100)
        public void test3() {
            int [] temp = {};
            int [] expected = {};
            temp = a.increaseOddIndices(temp);

            assertArrayEquals(temp, expected);
        }
    }
}