import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * MatricesChallenge Test Cases
 *
 * @author J. Collins, colli206@purdue.edu
 *
 */

@RunWith(Enclosed.class)
public class MatricesChallengeTest {

    private static MatricesChallenge m;

    public static class computeSumTest {

        @Before
        public void setUp() {
            m = new MatricesChallenge();
        }

        @Test(timeout = 100)
        public void test1() {
            int[][] myMatrix = new int[10][9];
            int count = 1;
            for (int i = 0; i < myMatrix.length; i++) {
                for (int j = 0; j < myMatrix[i].length; j++) {
                    myMatrix[i][j] = count++;
                }
            }
            int sum = m.computeSum(myMatrix);

            assertEquals(sum, (90*91)/2);
        }

        @Test(timeout = 100)
        public void test2() {
            int[][] myMatrix = new int[10][9];

            int sum = m.computeSum(myMatrix);

            assertEquals(sum, 0);
        }

    }
}