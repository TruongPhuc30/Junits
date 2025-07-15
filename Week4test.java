import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Week4test {
        @Test
        public void testPositiveNumbers() {
            assertEquals(10, Week4.max2Int(7, 10));
        }

        @Test
        public void testNegativeNumbers() {
            assertEquals(-2, Week4.max2Int(-5, -2));
        }

        @Test
        public void testEqualNumbers() {
            assertEquals(5, Week4.max2Int(5, 5));
        }

        @Test
        public void testZeroAndPositive() {
            assertEquals(3, Week4.max2Int(0, 3));
        }

        @Test
        public void testZeroAndNegative() {
            assertEquals(0, Week4.max2Int(-4, 0));
        }

        @Test
        public void testNormalArray() {
            assertEquals(-5, Week4.minArray(new int[]{1, 3, -5, 7, 2}));
        }

        @Test
        public void testAllNegative() {
            assertEquals(-9, Week4.minArray(new int[]{-1, -3, -9}));
        }

        @Test
        public void testSingleElement() {
            assertEquals(6, Week4.minArray(new int[]{6}));
        }

        @Test
        public void testAllEqual() {
            assertEquals(7, Week4.minArray(new int[]{7, 7, 7}));
        }

        @Test
        public void testWithZero() {
            assertEquals(0, Week4.minArray(new int[]{4, 0, 9}));
        }

        @Test
        public void testThin() {
            assertEquals("Thiếu cân", Week4.calculateBMI(45, 1.65));
        }

        @Test
        public void testNormalLow() {
            assertEquals("Bình thường", Week4.calculateBMI(50, 1.55));
        }

        @Test
        public void testNormalHigh() {
            assertEquals("Thừa cân", Week4.calculateBMI(60, 1.6));
        }

        @Test
        public void testOverweight() {
            assertEquals("Thừa cân", Week4.calculateBMI(73, 1.75));
        }

        @Test
        public void testObese() {
            assertEquals("Béo phì", Week4.calculateBMI(90, 1.65));
        }
}
